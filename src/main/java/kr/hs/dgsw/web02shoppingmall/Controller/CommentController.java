package kr.hs.dgsw.web02shoppingmall.Controller;

import kr.hs.dgsw.web02shoppingmall.Domain.Comment;
import kr.hs.dgsw.web02shoppingmall.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping(value = "/api/comment")
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    @GetMapping(value = "/api/comment/findByProduct/{productId}")
    public List<Comment> findByProductId(@PathVariable Long productId) {
        return commentService.findByProductId(productId);
    }

    @DeleteMapping(value = "/api/comment/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return commentService.deleteById(id);
    }

    @PostMapping(value = "/api/comment/add")
    public Long add(@RequestBody Comment comment) {
        return commentService.add(comment);
    }

    @PutMapping(value = "/api/comment/modify")
    public int modify(@RequestBody Comment comment) {
        return commentService.modify(comment);
    }

    @GetMapping(value = "/api/comment/find/{id}")
    public Comment findById(@PathVariable Long id) {
        return commentService.findById(id);
    }
}
