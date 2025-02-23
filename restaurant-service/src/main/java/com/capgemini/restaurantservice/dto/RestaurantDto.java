package com.capgemini.restaurantservice.dto;

import com.capgemini.restaurantservice.model.Address;
import com.capgemini.restaurantservice.model.FoodItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantDto {
    private String id;
    private String name;
    private String description;
    private Address address;
    private List<Long> contactInfo;
    private Double rating;
    private List<FoodItem> foodItems;
}
