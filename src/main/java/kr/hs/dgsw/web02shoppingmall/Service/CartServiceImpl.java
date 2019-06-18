package kr.hs.dgsw.web02shoppingmall.Service;

import kr.hs.dgsw.web02shoppingmall.Domain.Cart;
import kr.hs.dgsw.web02shoppingmall.Domain.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<Cart> findAll() {
        return cartMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return cartMapper.deleteById(id);
    }

    @Override
    public Long add(Cart cart) {
        return cartMapper.add(cart);
    }

    @Override
    public int modify(Cart cart) {
        return cartMapper.modify(cart);
    }

    @Override
    public Cart findById(Long id) {
        return cartMapper.findById(id);
    }

    @Override
    public List<Cart> findByUserId(Long userId) {
        return cartMapper.findByUserId(userId);
    }
}
