package Domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Product {
    private Long id;

    private String productName;
    private String imagePath;
    private String cost;
    private String companyName;
    private String detailDescription;
    private List<Comment> comments;
    private String eventName;
    private int mileage;
    private Long categoryId;

    //이달의 Best 상품, 인기상품을 알아낼 때 쓰는 구매횟수
    private String sellingCount;


    private LocalDateTime created;
    private LocalDateTime updated;
}
