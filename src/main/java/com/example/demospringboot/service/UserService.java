package com.example.demospringboot.service;

import com.example.demospringboot.model.request.JwtDtoReq;
import com.example.demospringboot.model.response.JwtDtoRes;
import com.example.demospringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

  private final UserRepository userRepository;

  private JwtDtoRes login(JwtDtoReq request) {
    return null;
  }
}