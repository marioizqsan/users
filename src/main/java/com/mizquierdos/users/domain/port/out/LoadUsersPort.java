package com.mizquierdos.users.domain.port.out;

import com.mizquierdos.users.domain.model.User;

import java.util.List;

public interface LoadUsersPort {
    List<User> loadAll();
}
