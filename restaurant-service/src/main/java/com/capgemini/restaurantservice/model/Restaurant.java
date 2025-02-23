package com.capgemini.restaurantservice.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
@Entity
public class Restaurant {
    @Id
    private String id;
    private String name;
    private String description;
    @Embedded
    private Address address;
    private List<Long> contactInfo;
    private Double rating;
    @Embedded
    private OwnerInfo owner;
}
