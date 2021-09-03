package com.epam.yevheniy.chornenky.market.place.servlet.dto;

public class UserRegistrationDTO {
    private final String name;
    private final String surName;
    private final String email;
    private final String psw;

    public UserRegistrationDTO(String name, String surName, String email, String psw) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.psw = psw;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmail() {
        return email;
    }

    public String getPsw() {
        return psw;
    }
}
