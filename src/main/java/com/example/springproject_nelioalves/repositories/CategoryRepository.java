package com.example.springproject_nelioalves.repositories;

import com.example.springproject_nelioalves.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
