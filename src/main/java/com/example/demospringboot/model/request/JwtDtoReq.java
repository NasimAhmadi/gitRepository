package com.example.demospringboot.model.request;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class JwtDtoReq {
  @NotNull
  private String userName;
  @NotNull
  private byte[] password;
}