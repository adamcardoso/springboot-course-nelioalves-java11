package com.example.springproject_nelioalves.repositories;

import com.example.springproject_nelioalves.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
