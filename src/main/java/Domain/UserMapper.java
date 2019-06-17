package Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

//    List<User> findAll();
//    int deleteById(@Param("id") Long id);
    Long add(User user);
    int modify(User user);
    User findById(@Param("id") Long id);
    User Login(User user);
}
