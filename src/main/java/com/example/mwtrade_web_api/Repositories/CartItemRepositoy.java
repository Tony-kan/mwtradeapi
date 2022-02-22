package com.example.mwtrade_web_api.Repositories;

import com.example.mwtrade_web_api.Entities.Cart_Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepositoy
extends JpaRepository<Cart_Item, Long> {


}
