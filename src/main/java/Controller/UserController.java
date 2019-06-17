package Controller;

import Service.UserService;
import Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/api/user/add")
    public Long add(User user) {
        return userService.add(user);
    }

    @PutMapping("/api/user/modify")
    public int modify(@RequestBody User user) {
        return userService.modify(user);
    }

    @GetMapping("/api/user/find/{id}")
    public User findById(@PathVariable  Long id) {
        return userService.findById(id);
    }

    @PostMapping("/api/Login")
    public User Login(User user) {
        return userService.Login(user);
    }
}
