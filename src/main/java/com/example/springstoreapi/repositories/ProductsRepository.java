package com.example.springstoreapi.repositories;

import com.example.springstoreapi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
