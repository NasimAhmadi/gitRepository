package com.example.demospringboot.model.response;

import com.example.demospringboot.model.enums.RoleNameEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class RoleDtoRes {
    private Long id;
    private RoleNameEnum roleName;
}
