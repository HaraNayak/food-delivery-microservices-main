package com.capgemini.authservice.model;

import lombok.Builder;

@Builder
public class DeliveryAgent {
    private String name;
    private Address address;
    private Long phoneNumber;
}
