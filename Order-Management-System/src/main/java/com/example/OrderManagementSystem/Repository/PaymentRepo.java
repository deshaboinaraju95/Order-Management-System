package com.example.OrderManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OrderManagementSystem.Pojo.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long>  {

}
