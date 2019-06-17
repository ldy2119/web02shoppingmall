package Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    private Long id;
    private Long userId;
    private String commentContent;
    private Long productId;

    private LocalDateTime created;
    private LocalDateTime updated;
}
