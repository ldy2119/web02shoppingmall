package Service;

import Domain.User;
import Domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Long add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int modify(User user) {
        return userMapper.modify(user);
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public User Login(User user) {
        return userMapper.Login(user);
    }
}
