package com.zemoso.order.service.service;

import com.zemoso.order.service.dto.OrderDTO;
import com.zemoso.order.service.entity.Order;
import com.zemoso.order.service.entity.Product;
import com.zemoso.order.service.exception.OrderNotFoundException;
import com.zemoso.order.service.exception.ProductNotFoundException;
import com.zemoso.order.service.exception.UserNotFoundException;
import com.zemoso.order.service.repository.OrderRepository;
import com.zemoso.order.service.utils.DateFormatter;
import com.zemoso.order.service.vo.ProductDTO;
import com.zemoso.order.service.vo.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final RestTemplate restTemplate;

    private static final ModelMapper modelMapper = new ModelMapper();

    private final DateFormatter dateFormatter;

    private static final String USER_SERVICE_URL = "http://USER-SERVICE/users/";
    private static final String PRODUCT_SERVICE_URL = "http://PRODUCT-SERVICE/products/";

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository,
                            RestTemplate restTemplate, DateFormatter dateFormatter) {
        this.orderRepository = orderRepository;
        this.restTemplate = restTemplate;
        this.dateFormatter = dateFormatter;
    }

    @Override
    public OrderDTO convertOrderToDTO(Order order) {
        return modelMapper.map(order, OrderDTO.class);
    }

    @Override
    public Order convertOrderToEntity(OrderDTO orderDTO) {
        return modelMapper.map(orderDTO, Order.class);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("Order not found with id: " + orderId));
    }

    @Override
    public OrderDTO addOrder(OrderDTO orderDTO) {
        try {
            // Validation of user and products
            Map<Boolean, Long> res = validateProducts(orderDTO);

            boolean isValid = res.containsKey(true) && res.get(true) > 0;

            if (validateUserById(orderDTO.getUser().getId()) && isValid) {
                //  Setting timestamp for the order
                Date currentDate = new Date();
                orderDTO.setCreatedAt(dateFormatter.formatToIndiaTimeZone(currentDate));
                orderDTO.setUser(getUserById(orderDTO.getUser().getId()));
                Order order = convertOrderToEntity(orderDTO);
                order.setTotalAmount(BigDecimal.valueOf(res.get(true)));
                orderRepository.save(order);
                return convertOrderToDTO(order);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Error adding order: " + e.getMessage());
        }
    }

    @Override
    public String deleteOrderById(Long orderId) {
        Optional<Order> orderOptional = orderRepository.findById(orderId);
        if (orderOptional.isPresent()) {
            orderRepository.deleteById(orderId);
            return "Order deleted with id: " + orderId;
        } else {
            throw new OrderNotFoundException("Order not found with id: " + orderId);
        }
    }

    boolean validateUserById(Long userId) {
        // Call to the USER-MICROSERVICE
        UserDTO userDTO = restTemplate.getForObject(USER_SERVICE_URL + userId, UserDTO.class);
        if (userDTO == null) {
            throw new UserNotFoundException("User not found with id: " + userId);
        }
        return true;
    }

    @Override
    public UserDTO getUserById(Long userId) {
        // Get the user from the USER-SERVICE
        UserDTO userDTO = restTemplate.getForObject(USER_SERVICE_URL + userId, UserDTO.class);
        if (userDTO == null) {
            throw new UserNotFoundException("User not found with id: " + userId);
        }
        return userDTO;
    }

    @Override
    public Product getProductById(Long productId) {
        // Get the user from the PRODUCT-SERVICE
        ProductDTO productDTO = restTemplate.getForObject(PRODUCT_SERVICE_URL + productId, ProductDTO.class);
        if (productDTO == null) {
            throw new ProductNotFoundException("Product not found with id: " + productId);
        }
        return modelMapper.map(productDTO, Product.class);
    }

    Map<Boolean, Long> validateProducts(OrderDTO orderDTO) {
        Map<Boolean, Long> res = new HashMap<>();
        BigDecimal totalPrice = BigDecimal.ZERO;

        List<ProductDTO> products = orderDTO.getProducts();

        for (ProductDTO product : products) {
            if (product.getPrice() == null || !validateProductById(product.getId())) {
                res.put(false, 0L);
                return res;
            }
            totalPrice = totalPrice.add(product.getPrice());
        }

        res.put(true, totalPrice.longValue());
        return res;
    }

    boolean validateProductById(Long productId) {
        // Call to the PRODUCT-MICROSERVICE
        ProductDTO productDTO = restTemplate.getForObject(PRODUCT_SERVICE_URL + productId, ProductDTO.class);
        return productDTO != null;
    }
}
