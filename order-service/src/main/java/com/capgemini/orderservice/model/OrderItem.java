package com.capgemini.orderservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;



@Data
@JsonInclude(JsonInclude.Include.NON_NULL)

public class OrderItem {
    private String name;
    private Integer price;
    private Integer quantity;
    private String foodItemId;
}
