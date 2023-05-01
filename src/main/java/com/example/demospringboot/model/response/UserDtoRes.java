package com.example.demospringboot.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Setter
@Getter
@Accessors(chain = true)
public class UserDtoRes {
    private Long id;
    private String name;
    private List<RoleDtoRes> roles;
}
