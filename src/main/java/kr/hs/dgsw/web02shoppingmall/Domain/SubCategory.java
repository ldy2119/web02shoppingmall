package kr.hs.dgsw.web02shoppingmall.Domain;

import lombok.Data;

@Data
public class SubCategory {
    private long id;
    private long categoryId;
    private String categoryName;
}
