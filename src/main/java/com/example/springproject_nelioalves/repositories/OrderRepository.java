package com.example.springproject_nelioalves.repositories;

import com.example.springproject_nelioalves.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
