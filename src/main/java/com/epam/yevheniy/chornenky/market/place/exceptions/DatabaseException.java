package com.epam.yevheniy.chornenky.market.place.exceptions;

public class DatabaseException extends CommonException {

    @Override
    public String getMessage() {
        return "Все плохо с БД";
    }
}
