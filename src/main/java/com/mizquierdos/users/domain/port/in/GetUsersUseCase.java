package com.mizquierdos.users.domain.port.in;

import com.mizquierdos.users.domain.model.User;

import java.util.List;

public interface GetUsersUseCase {
    List<User> getAll();
}
