package com.capgemini.userservice.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
@Entity
public class User {
    @Id
    private String id;
    private String fullName;
    private String email;
    private String password;
    private Long phoneNumber;
    @Embedded
    private Address address;
    private UserRole userRole;
}
