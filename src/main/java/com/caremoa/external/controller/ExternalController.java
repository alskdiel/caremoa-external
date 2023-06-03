package com.caremoa.external.controller;

import java.security.SecureRandom;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.caremoa.external.domain.dto.PaymentDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExternalController {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int LENGTH = 10;

    @PostMapping("/external/approve-payment")
    public PaymentDto approvePayment(@RequestBody PaymentDto paymentDto) {
    	log.debug("approvePayment()");
    	if(paymentDto.getPaymentRequestState().equals("REQUESTED")) {
        	paymentDto.setPaymentRequestState("APPROVED");
        	paymentDto.setApproveNo(generateRandomString());	
    	} else {
        	paymentDto.setPaymentRequestState("REJECTED");
    	}
    	return paymentDto;
    }
    
    @PostMapping("/external/cancel-payment")
    public PaymentDto cancelPayment(@RequestBody PaymentDto paymentDto) {
    	log.debug("cancelPayment()");
    	if(paymentDto.getPaymentRequestState().equals("REQUESTED")) {
        	paymentDto.setPaymentRequestState("APPROVED");
    	} else {
        	paymentDto.setPaymentRequestState("REJECTED");
    	}
    	return paymentDto;
    }
    
    public static String generateRandomString() {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(LENGTH);

        for (int i = 0; i < LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }
    

}
