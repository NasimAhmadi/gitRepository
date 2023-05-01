package com.example.demospringboot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Setter
@Getter
@Accessors(chain = true)
public class UserDto {
    private Long id;
    private String name;
    private List<RoleDto> roles;
}
