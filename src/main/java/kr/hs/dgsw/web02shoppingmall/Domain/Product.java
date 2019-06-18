package kr.hs.dgsw.web02shoppingmall.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Product {
    private Long id;

    private String productName;
    private String imagePath;
    private int cost;
    private String companyName;
    private String detailDescription;
    private String eventName;
    private int mileage;
    private Long categoryId;

    //이달의 Best 상품, 인기상품을 알아낼 때 쓰는 구매횟수
    private int sellingCount;


    private LocalDateTime created;
    private LocalDateTime updated;
}
