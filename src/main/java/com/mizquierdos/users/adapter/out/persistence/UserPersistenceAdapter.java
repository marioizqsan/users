package com.mizquierdos.users.adapter.out.persistence;

import com.mizquierdos.users.domain.model.User;
import com.mizquierdos.users.domain.port.out.LoadUsersPort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserPersistenceAdapter implements LoadUsersPort {
    private final UserRepository userRepository;

    public UserPersistenceAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> loadAll() {
        return userRepository.findAll()
                .stream()
                .map(userJpaEntity -> new User(
                        userJpaEntity.getId(),
                        userJpaEntity.getName(),
                        userJpaEntity.getEmail()))
                .toList();
    }
}
