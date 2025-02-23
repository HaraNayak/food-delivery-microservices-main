package com.capgemini.restaurantservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.bson.types.Binary;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class FoodItem {
    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    @Lob
    private byte[] icon;
    private Integer quantity;
    private String restaurantId;
}
