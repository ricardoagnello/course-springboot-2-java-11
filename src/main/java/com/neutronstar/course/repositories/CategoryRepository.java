package com.neutronstar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neutronstar.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
