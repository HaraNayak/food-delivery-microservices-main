package com.capgemini.restaurantservice.repository;

import com.capgemini.restaurantservice.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, String> {
    List<FoodItem> findByRestaurantId(String restaurantId);
}
