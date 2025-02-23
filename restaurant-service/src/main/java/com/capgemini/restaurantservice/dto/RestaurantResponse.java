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
public class RestaurantResponse {
    private RestaurantDto restaurantDto;
    private Integer responseCode;
    private String msg;
}
