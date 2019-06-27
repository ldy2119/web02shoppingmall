package kr.hs.dgsw.web02shoppingmall.Controller;

import kr.hs.dgsw.web02shoppingmall.Domain.Cart;
import kr.hs.dgsw.web02shoppingmall.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping(value = "/api/cart")
    public List<Cart> findAll() {
        return cartService.findAll();
    }

    @DeleteMapping(value = "/api/cart/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return cartService.deleteById(id);
    }

    @PostMapping(value = "/api/cart/add")
    public Long add(@RequestBody Cart cart) {
        return cartService.add(cart);
    }

    @PutMapping(value = "/api/cart/modify")
    public int modify(@RequestBody Cart cart) {
        return cartService.modify(cart);
    }

    @GetMapping(value = "/api/cart/find/{id}")
    public Cart findById(@PathVariable Long id) {
        return cartService.findById(id);
    }

    @GetMapping(value = "/api/cart/findByUser/{userId}")
    public List<Cart> findByUserId(@PathVariable Long userId) {
        return cartService.findByUserId(userId);
    }
}
