package com.caremoa.external.domain.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaymentDto {

    private Long id;
	private LocalDateTime requestDateTime;
	private Integer requestAmount;
	private LocalDateTime responseDateTime;
	private String paymentRequestState;
	private String approveNo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getRequestDateTime() {
		return requestDateTime;
	}
	public void setRequestDateTime(LocalDateTime requestDateTime) {
		this.requestDateTime = requestDateTime;
	}
	public Integer getRequestAmount() {
		return requestAmount;
	}
	public void setRequestAmount(Integer requestAmount) {
		this.requestAmount = requestAmount;
	}
	public LocalDateTime getResponseDateTime() {
		return responseDateTime;
	}
	public void setResponseDateTime(LocalDateTime responseDateTime) {
		this.responseDateTime = responseDateTime;
	}
	public String getApproveNo() {
		return approveNo;
	}
	public void setApproveNo(String approveNo) {
		this.approveNo = approveNo;
	}
	public String getPaymentRequestState() {
		return paymentRequestState;
	}
	public void setPaymentRequestState(String paymentRequestState) {
		this.paymentRequestState = paymentRequestState;
	}
	
	
}
