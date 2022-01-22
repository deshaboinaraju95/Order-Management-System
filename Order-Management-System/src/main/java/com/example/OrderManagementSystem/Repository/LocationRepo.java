package com.example.OrderManagementSystem.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OrderManagementSystem.Pojo.Location;
@Repository
public interface LocationRepo  extends JpaRepository<Location, Long> {
	
	

}
