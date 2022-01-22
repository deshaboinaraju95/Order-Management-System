package com.example.OrderManagementSystem.Pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;




@Entity
public class Payment {
    @Id
    @GeneratedValue
    private Long paymentid;

    private long timestamp;
    private int amount;
    @OneToOne(mappedBy="payment")
    private Order porder;
   // private CreditCardInfo creditCardInfo;

    public Long getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(Long paymentid) {
		this.paymentid = paymentid;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
	

	public Order getPorder() {
		return porder;
	}

	public void setPorder(Order porder) {
		this.porder = porder;
	}

	/*public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	@JsonIgnore
    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }*/
}
