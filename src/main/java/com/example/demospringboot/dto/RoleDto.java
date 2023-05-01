package com.example.demospringboot.dto;

import com.example.demospringboot.enums.RoleNameEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class RoleDto {
    private Long id;
    private RoleNameEnum roleName;
}
