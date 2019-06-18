package kr.hs.dgsw.web02shoppingmall.Service;

import kr.hs.dgsw.web02shoppingmall.Domain.User;

public interface UserService {

    Long add(User user);
    int modify(User user);
    User findById(Long id);
    User Login(User user);
    User checkAccount(String account);
}
