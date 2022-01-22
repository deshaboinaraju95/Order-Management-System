package com.example.OrderManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OrderManagementSystem.Pojo.CreditCardInfo;

@Repository
public interface CraditCardInfoRepo extends JpaRepository<CreditCardInfo, Long> {

}
