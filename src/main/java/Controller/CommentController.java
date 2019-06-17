package Controller;

import Domain.Comment;
import Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/api/comment")
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    @GetMapping("/api/comment/findByProduct/{id}")
    public List<Comment> findByProductId(@PathVariable Long productId) {
        return commentService.findByProductId(productId);
    }

    @DeleteMapping("/api/comment/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return commentService.deleteById(id);
    }

    @PostMapping("/api/comment/add")
    public Long add(@RequestBody Comment comment) {
        return commentService.add(comment);
    }

    @PutMapping("/api/comment/modify")
    public int modify(@RequestBody Comment comment) {
        return commentService.modify(comment);
    }

    @GetMapping("/api/comment/find/{id}")
    public Comment findById(@PathVariable Long id) {
        return commentService.findById(id);
    }
}
