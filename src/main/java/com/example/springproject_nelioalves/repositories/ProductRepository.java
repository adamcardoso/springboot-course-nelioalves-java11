package com.example.springproject_nelioalves.repositories;

import com.example.springproject_nelioalves.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
