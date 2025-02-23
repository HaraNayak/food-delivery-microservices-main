package com.capgemini.authservice.model;

import lombok.ToString;

@ToString
public enum UserRole {
    CUSTOMER,
    DELIVERY_AGENT,
    RESTAURANT_OWNER,
    ADMIN
}
