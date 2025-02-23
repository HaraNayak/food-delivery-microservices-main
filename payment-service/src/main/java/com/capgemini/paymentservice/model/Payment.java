package com.capgemini.paymentservice.model;

import com.capgemini.paymentservice.model.CreditCardInfo;
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
@Table(name = "payments")
@Entity
public class Payment {
    @Id
    private String id;
    private Long timestamp;
    private Double amount;
    @Embedded
    private CreditCardInfo creditCardInfo;
    private String orderId;
    @Embedded
    private PaymentStatus paymentStatus;

}
