package com.example.antiquevideogames.repositories;

import com.example.antiquevideogames.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
