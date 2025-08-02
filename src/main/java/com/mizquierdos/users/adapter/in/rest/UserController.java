package com.mizquierdos.users.adapter.in.rest;

import com.mizquierdos.users.domain.model.User;
import com.mizquierdos.users.domain.port.in.GetUsersUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final GetUsersUseCase getUsersUseCase;

    public UserController(GetUsersUseCase getUsersUseCase) {
        this.getUsersUseCase = getUsersUseCase;
    }

    @GetMapping
    public List<User> getAll() {
        return getUsersUseCase.getAll();
    }
}
