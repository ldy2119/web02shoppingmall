package kr.hs.dgsw.web02shoppingmall.Service;

import kr.hs.dgsw.web02shoppingmall.Domain.Comment;
import kr.hs.dgsw.web02shoppingmall.Domain.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> findAll() {
        return commentMapper.findAll();
    }

    @Override
    public List<Comment> findByProductId(Long productId) {
        return commentMapper.findByProductId(productId);
    }

    @Override
    public int deleteById(Long id) {
        return commentMapper.deleteById(id);
    }

    @Override
    public Long add(Comment comment) {
        return commentMapper.add(comment);
    }

    @Override
    public int modify(Comment comment) {
        return commentMapper.modify(comment);
    }

    @Override
    public Comment findById(Long id) {
        return commentMapper.findById(id);
    }
}
