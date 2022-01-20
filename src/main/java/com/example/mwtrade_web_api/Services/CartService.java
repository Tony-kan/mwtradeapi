package com.example.mwtrade_web_api.Services;

import com.example.mwtrade_web_api.Entities.Cart_Item;
import com.example.mwtrade_web_api.Entities.ShoppingCart;
import com.example.mwtrade_web_api.Repositories.CartItemRepositoy;
import com.example.mwtrade_web_api.Repositories.CustomerRepository;
import com.example.mwtrade_web_api.Repositories.ProductRepository;
import com.example.mwtrade_web_api.Repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class CartService {

    private final CartItemRepositoy cartItemRepositoy;
    private final ProductRepository productRepository;
    private final ShoppingCartRepository shoppingCartRepository;
    private final CustomerRepository customerRepository;

    private final ProductService productService;
    private final CustomerService customerService;

    @Autowired
    public CartService(CartItemRepositoy cartItemRepositoy, ProductRepository productRepository, ShoppingCartRepository shoppingCartRepository, CustomerRepository customerRepository, ProductService productService, CustomerService customerService) {
        this.cartItemRepositoy = cartItemRepositoy;
        this.productRepository = productRepository;
        this.shoppingCartRepository = shoppingCartRepository;
        this.customerRepository = customerRepository;
        this.productService = productService;
        this.customerService = customerService;
    }


    public void addNewCartItem(Long productId, Integer quantity, Long customerId) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Cart_Item cart_item = new Cart_Item();
        cart_item.setQuantity(quantity);

       cart_item.setProduct(productRepository.findProductByPId(productId));
      cart_item.setCustomer(customerRepository.findCustomerByCId(customerId));
        shoppingCart.getItems().add(cart_item);
        shoppingCart.setDate(new Date());
        shoppingCartRepository.save(shoppingCart);
    }

    public List<ShoppingCart> getShoppingCart() {

      return   shoppingCartRepository.findAll();
    }
}
