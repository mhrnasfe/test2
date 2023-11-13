package com.example.test.service.imp;

import com.example.test.repository.UserRepository;
import com.example.test.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

}
