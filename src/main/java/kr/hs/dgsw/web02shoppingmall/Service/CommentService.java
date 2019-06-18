package kr.hs.dgsw.web02shoppingmall.Service;

import kr.hs.dgsw.web02shoppingmall.Domain.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> findAll();
    List<Comment> findByProductId(Long productId);
    int deleteById(Long id);
    Long add(Comment comment);
    int modify(Comment comment);
    Comment findById(Long id);
}
