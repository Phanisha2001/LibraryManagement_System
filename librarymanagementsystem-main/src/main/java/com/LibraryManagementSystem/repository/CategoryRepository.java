package com.LibraryManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LibraryManagementSystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
