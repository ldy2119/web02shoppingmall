package kr.hs.dgsw.web02shoppingmall.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    private Long id;
    private String filteredUserName;
    private String commentContent;
    private Long productId;

    private LocalDateTime created;
    private LocalDateTime updated;
}
