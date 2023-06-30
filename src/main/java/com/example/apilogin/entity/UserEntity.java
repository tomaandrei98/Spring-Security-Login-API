package com.example.apilogin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class UserEntity {
    private Long id;
    private String email;
    @JsonIgnore
    private String password;
    private String role;
    private String extraInfo;
}
