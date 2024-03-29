package kr.hs.dgsw.web02shoppingmall.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {

    private Long id;

    private String account;
    private String password;
    private String userName;
    private String phoneNumber;
    private  String telNumber;
    private String postNumber;
    private String address;
    private String detailAddress;
    private String email;
    private int mileage;

    private LocalDateTime created;
    private LocalDateTime updated;
}
