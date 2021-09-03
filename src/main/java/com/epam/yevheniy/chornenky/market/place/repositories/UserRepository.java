package com.epam.yevheniy.chornenky.market.place.repositories;

import com.epam.yevheniy.chornenky.market.place.repositories.entities.UserEntity;

import java.util.Optional;

public interface UserRepository {

    Optional<UserEntity> findByEmail(String emailForSearch);

    void createUser (UserEntity user);
}
