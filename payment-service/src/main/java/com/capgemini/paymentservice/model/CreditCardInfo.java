package com.capgemini.paymentservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@Table(name = "creditCards")
public class CreditCardInfo {
    @Id
    private String id;
    private String cardNumber;
    private String cardHolderName;
    private String expiryMonth;
    private String expiryYear;
    private String securityCode;
}
