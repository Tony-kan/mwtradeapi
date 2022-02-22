package com.example.mwtrade_web_api.Controller;

import com.example.mwtrade_web_api.Entities.Cart_Item;
import com.example.mwtrade_web_api.Entities.ShoppingCart;
import com.example.mwtrade_web_api.Services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/v3/MW_Trade/Home/ShoppingCart")
public class CartController {
    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

@PostMapping(path="/addtocart/")
    public void addToCart(@RequestParam("productId") Long productId,
                          @RequestParam("cartItemQuantity") Integer quantity,
                          @RequestParam("customerId") Long customerId){
        cartService.addNewCartItem(productId,quantity,customerId);

}

@GetMapping(path="/list")
    public List<ShoppingCart> getShoppingCartList(){
        return cartService.getShoppingCart();
}

@GetMapping(path="/cartList")
public  List<Cart_Item> viewCart_itemList() {

    return cartService.getCart_items();
}

}