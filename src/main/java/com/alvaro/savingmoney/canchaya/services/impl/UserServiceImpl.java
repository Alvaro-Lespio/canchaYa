package com.alvaro.savingmoney.canchaya.services.impl;

import com.alvaro.savingmoney.canchaya.entities.User;
import com.alvaro.savingmoney.canchaya.excepcions.UserUpdateFailedException;
import com.alvaro.savingmoney.canchaya.repositories.IUserRepository;
import com.alvaro.savingmoney.canchaya.services.interf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
        return "the user has been create successfully";
    }

    //Delete user
    @Override
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "the user has been deleted successfully";
    }

    //Update user
    @Override
    public String updateUser(User user,Long id) {
        List<User> userList = userRepository.findAll();
        User user1 = userList.stream().filter(u -> u.getId().equals(id)).findFirst().orElseThrow(() -> new UserUpdateFailedException("Check your details, because some of the are incorrect"));
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());
        user1.setPhone(user.getPhone());
        user1.setUsername(user.getUsername());

        userRepository.save(user1);
        return "The user has been updated successfully ";
    }


    //List users
    public List<User> listUser(){
        List<User> userList = userRepository.findAll();
        return userList;
    }
}
