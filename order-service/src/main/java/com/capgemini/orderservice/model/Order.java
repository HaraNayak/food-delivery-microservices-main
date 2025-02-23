package com.capgemini.orderservice.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {
    @Id
    private String id;
    private Long orderNumber;
    private String restaurantId;
    @Embedded
    private List<OrderItem> orderItems;
    private BigDecimal totalAmount;
    private Long orderTime;
    @Embedded
    private Address address;
    private Long deliveryTime;
    @Embedded
    private OrderStatus orderStatus;
    private String paymentId;
    private String userId;
}
