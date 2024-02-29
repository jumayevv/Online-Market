package com.jumayev.market_project.CONTROLLERS;

import com.jumayev.market_project.ENTITIES.User;
import com.jumayev.market_project.SERVICES.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController implements EntyController<User>{
    private final UserService userService;
    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User update(User body) {
        return null;
    }

    @Override
    public User create(User body) {
        System.out.println(body);
        return userService.create(body);
    }

    @Override
    public String deleteById(Long id) {
        return EntyController.super.deleteById(id);
    }
}
