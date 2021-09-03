package com.epam.yevheniy.chornenky.market.place.repositories;

import com.epam.yevheniy.chornenky.market.place.repositories.entities.UserEntity;
import com.epam.yevheniy.chornenky.market.place.exceptions.AuthenticationException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository {
    private Map<String, UserEntity> usersMap = new HashMap<>();

    public synchronized void createUser(UserEntity user) {
        usersMap.put(user.getEmail(), user);
    }

    public UserEntity getUser(String email) {
        UserEntity userEntity = usersMap.get(email);
        if (userEntity == null) {
            throw new AuthenticationException();
        }
        return userEntity;
    }

    public Optional<UserEntity> findByEmail(String emailForSearch) {
        for (String s : usersMap.keySet()) {
            if (s.equals(emailForSearch)) {
                return Optional.of(usersMap.get(s));
            }
        }
        return Optional.empty();
    }

    public Map<String, UserEntity> getUsersMap() {
        return usersMap;
    }
}
