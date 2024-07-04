package com.alvaro.savingmoney.canchaya.excepcions;

public class UserUpdateFailedException extends RuntimeException{
    public UserUpdateFailedException(String message) {
        super(message);
    }
}
