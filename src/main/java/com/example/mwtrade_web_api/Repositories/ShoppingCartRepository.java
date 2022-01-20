package com.example.mwtrade_web_api.Repositories;

import com.example.mwtrade_web_api.Entities.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository
extends JpaRepository <ShoppingCart, Long> {
}
