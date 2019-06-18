package kr.hs.dgsw.web02shoppingmall.Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

//    List<User> findAll();
//    int deleteById(@Param("id") Long id);
    Long add(User user);
    int modify(User user);
    User findById(@Param("id") Long id);
    User Login(User user);
    User checkAccount(@Param("account") String account);
}
