package com.example.demospringboot.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class JwtDtoRes {
  private String jwtRes;
}
