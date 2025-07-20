package com.mizquierdos.users.adapter.out.persistence;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class UserJpaEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}
