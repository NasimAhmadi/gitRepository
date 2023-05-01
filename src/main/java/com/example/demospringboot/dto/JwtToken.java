package com.example.demospringboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Setter
@Getter
@Accessors(chain = true)
public class JwtToken {
   // private UserDto[] usersDto;
    private List<UserDto> usersDto;
}