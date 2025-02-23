package com.capgemini.authservice.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Table(name = "users")
public class UserCredential {
    @Id
    private String id;
    private String fullName;
    private String username; //email
    private String password;
    private Long phoneNumber;
    @Embedded
    private Address address;
    private UserRole userRole;
}
