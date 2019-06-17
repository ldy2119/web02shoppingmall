package Controller;

import Domain.Cart;
import Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/api/cart")
    public List<Cart> findAll() {
        return cartService.findAll();
    }

    @DeleteMapping("/api/cart/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return cartService.deleteById(id);
    }

    @PostMapping("/api/cart/add")
    public Long add(@RequestBody Cart cart) {
        return cartService.add(cart);
    }

    @PutMapping("/api/cart/modify")
    public int modify(@RequestBody Cart cart) {
        return cartService.modify(cart);
    }

    @GetMapping("/api/cart/find/{id}")
    public Cart findById(@PathVariable Long id) {
        return cartService.findById(id);
    }

    @GetMapping("/api/cart/findByUser/{id}")
    public List<Cart> findByUserId(@PathVariable Long userId) {
        return cartService.findByUserId(userId);
    }
}
