package com.zemoso.order.service.service;

import com.zemoso.order.service.dto.OrderDTO;
import com.zemoso.order.service.entity.Order;
import com.zemoso.order.service.entity.Product;
import com.zemoso.order.service.vo.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    public OrderDTO convertOrderToDTO(Order order);

    public Order convertOrderToEntity(OrderDTO orderDTO);

    public List<Order> getAllOrders();

    public Order getOrderById(Long orderId);

    public OrderDTO addOrder(OrderDTO orderDTO);

    public String deleteOrderById(Long orderId);

    public UserDTO getUserById(Long userId);

    public Product getProductById(Long userId);

//    public List<Product> getProductsByIds(List<Long> productIds);
//
//    public boolean validateProducts(List<Long> products);


}
