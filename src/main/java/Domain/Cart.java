package Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Cart {
    private Long id;

    private Long userId;
    private Long productId;
    private int productCount;


    private LocalDateTime created;
    private LocalDateTime updated;
}
