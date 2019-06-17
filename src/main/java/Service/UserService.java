package Service;

import Domain.User;

public interface UserService {

    Long add(User user);
    int modify(User user);
    User findById(Long id);
    User Login(User user);
}
