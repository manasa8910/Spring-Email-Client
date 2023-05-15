package com.example.springEmailClient.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    private String username;
    private String password;
    private String roles;  //"ADMIN,USER"
    private User user;

}
