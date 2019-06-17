package Domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommentMapper {

    List<Comment> findAll();
    List<Comment> findByProductId(@Param("id") Long productId);
    int deleteById(@Param("id") Long id);
    Long add(Comment comment);
    int modify(Comment comment);
    Comment findById(@Param("id") Long id);
}
