package com.capgemini.authservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.capgemini.authservice.model.Address;
import com.capgemini.authservice.model.UserRole;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
    private String id;
    private String fullName;
    private String email;
    private Long phoneNumber;
    private Address address;
    private UserRole userRole;
}
