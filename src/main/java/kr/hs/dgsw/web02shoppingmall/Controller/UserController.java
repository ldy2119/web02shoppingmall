package kr.hs.dgsw.web02shoppingmall.Controller;

import kr.hs.dgsw.web02shoppingmall.Service.UserService;
import kr.hs.dgsw.web02shoppingmall.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/api/user/add")
    public Long add(@RequestBody User user) {

        return userService.add(user);
    }

    @PutMapping(value = "/api/user/modify")
    public int modify(@RequestBody User user) {
        return userService.modify(user);
    }

    @GetMapping(value = "/api/user/find/{id}")
    public User findById(@PathVariable  Long id) {
        return userService.findById(id);
    }

    @PostMapping(value = "/api/login")
    public User Login(@RequestBody User user) {
        return userService.Login(user);
    }

    @GetMapping(value = "/api/user/checkAccount/{account}")
    public User checkAccount(@PathVariable String account)
    {
        return userService.checkAccount(account);
    }
}
