package com.epam.yevheniy.chornenky.market.place.repositories.entities;

public class UserEntity {


    private final String name;
    private final String surName;
    private final String psw;
    private final String email;
    private final String role;
    private final String id;

    public UserEntity(String name, String surName, String psw, String email, String id, String role) {
        this.name = name;
        this.surName = surName;
        this.psw = psw;
        this.email = email;
        this.id = id;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPsw() {
        return psw;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
}
