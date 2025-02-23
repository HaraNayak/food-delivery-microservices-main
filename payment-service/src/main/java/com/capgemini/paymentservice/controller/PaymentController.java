package com.capgemini.paymentservice.controller;

import com.capgemini.paymentservice.model.Payment;
import com.capgemini.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/payment")
@RequiredArgsConstructor
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String pay(@RequestBody Payment payment) {
        return paymentService.processPayment(payment);
    }
}
