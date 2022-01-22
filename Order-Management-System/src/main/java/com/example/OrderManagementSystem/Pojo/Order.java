package com.example.OrderManagementSystem.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="orders")
public class Order {
	
	
	 @Id
	 @GeneratedValue
	    private Long orderid;

	    @ManyToOne
	    @JsonBackReference
	    @JoinColumn(name = "user_fkid")
	    private  User user;

	    @OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="payment_fkId")
	    private Payment payment;
	    private OrderStatus orderStatus;
	   
	    
	    @OneToMany(targetEntity=MenuItem.class)
	   
	    private List<MenuItem> items =new ArrayList<>() ;
	   
	    
	    //private DeliveryInfo deliveryInfo;
	    private double totalCost;
	    private String note;
	    @CreatedDate
	    private Date creationTime;
	    @LastModifiedDate
	    private Date lastModifyTime;
		public Long getOrderid() {
			return orderid;
		}
		public void setOrderid(Long orderid) {
			this.orderid = orderid;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Payment getPayment() {
			return payment;
		}
		public void setPayment(Payment payment) {
			this.payment = payment;
		}
		public OrderStatus getOrderStatus() {
			return orderStatus;
		}
		public void setOrderStatus(OrderStatus orderStatus) {
			this.orderStatus = orderStatus;
		}
		public List<MenuItem> getItems() {
			return items;
		}
		public void setItems(List<MenuItem> items) {
			this.items = items;
		}
		/*public DeliveryInfo getDeliveryInfo() {
			return deliveryInfo;
		}
		public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
			this.deliveryInfo = deliveryInfo;
		}*/
		public double getTotalCost() {
			return totalCost;
		}
		public void setTotalCost(double totalCost) {
			this.totalCost = totalCost;
		}
		public String getNote() {
			return note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		public Date getCreationTime() {
			return creationTime;
		}
		public void setCreationTime(Date creationTime) {
			this.creationTime = creationTime;
		}
		public Date getLastModifyTime() {
			return lastModifyTime;
		}
		public void setLastModifyTime(Date lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}
		
	    
	    
	    
	    
	    
	    
}
