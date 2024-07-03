package com.alvaro.savingmoney.canchaya.services.impl;

import com.alvaro.savingmoney.canchaya.entities.User;
import com.alvaro.savingmoney.canchaya.repositories.IUserRepository;
import com.alvaro.savingmoney.canchaya.services.interf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    //Injection Dependency
    private IUserRepository userRepository;
    @Autowired
    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }
    //Create User
    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "the user can be create successfully";
    }
    //Delete user

    //Update user

    //List users
}
