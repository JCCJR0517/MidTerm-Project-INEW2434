package com.example.antiquevideogames.repositories;

import com.example.antiquevideogames.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
