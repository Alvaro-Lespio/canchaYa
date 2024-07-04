package com.alvaro.savingmoney.canchaya.services.interf;

import com.alvaro.savingmoney.canchaya.entities.User;

public interface IUserService {
    String createUser(User user);
    String deleteUser(Long id);
    String updateUser(User user, Long id);
}
