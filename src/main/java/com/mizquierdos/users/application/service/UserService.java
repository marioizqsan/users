package com.mizquierdos.users.application.service;

import com.mizquierdos.users.domain.model.User;
import com.mizquierdos.users.domain.port.in.GetUsersUseCase;
import com.mizquierdos.users.domain.port.out.LoadUsersPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements GetUsersUseCase {

    private final LoadUsersPort loadUsersPort;

    public UserService(LoadUsersPort loadUsersPort) {
        this.loadUsersPort = loadUsersPort;
    }

    public List<User> getAll() {
        return loadUsersPort.loadAll();
    }
}

