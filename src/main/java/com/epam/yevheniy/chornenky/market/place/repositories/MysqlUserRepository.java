package com.epam.yevheniy.chornenky.market.place.repositories;

import com.epam.yevheniy.chornenky.market.place.db.ConnectionFactory;
import com.epam.yevheniy.chornenky.market.place.exceptions.DatabaseException;
import com.epam.yevheniy.chornenky.market.place.repositories.entities.UserEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class MysqlUserRepository implements UserRepository {

    private static final String GET_USER_BY_EMAIL_QUERY = "SELECT users.email, users.name, users.psw, users.surName, users.id, roles.role_name FROM users LEFT JOIN roles ON users.role_id = roles.id WHERE users.email = ?";

    @Override
    public Optional<UserEntity> findByEmail(String emailForSearch) {
        try {
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_BY_EMAIL_QUERY);
            preparedStatement.setString(1, emailForSearch);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String surName = resultSet.getString("surName");
                String email = resultSet.getString("email");
                String psw = resultSet.getString("psw");
                String roleName = resultSet.getString("role_name");
                UserEntity.Role role = UserEntity.Role.valueOf(roleName);
                String id = resultSet.getString("id");
                UserEntity userEntity = new UserEntity(name, surName, psw, email, id, role);
                return Optional.of(userEntity);
            }
            return Optional.empty();
        } catch (SQLException e) {
            throw new DatabaseException();
        }
    }

    @Override
    public void createUser(UserEntity user) {
    }
}
