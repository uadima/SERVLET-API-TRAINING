package com.epam.yevheniy.chornenky.market.place.exceptions;

import java.util.Map;

public class ValidationException extends CommonException{
    private final Map<String, String> validationMap;

    public ValidationException(Map<String, String> validationMap) {
        this.validationMap = validationMap;
    }

    public Map<String, String> getValidationMap() {
        return validationMap;
    }
}
