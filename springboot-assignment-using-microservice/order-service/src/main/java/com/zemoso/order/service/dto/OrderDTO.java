package com.zemoso.order.service.dto;


import com.zemoso.order.service.vo.ProductDTO;
import com.zemoso.order.service.vo.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long id;

    private UserDTO user = new UserDTO();

    private List<ProductDTO> products = new ArrayList<>();

    private BigDecimal totalAmount;

    private String createdAt;

}


