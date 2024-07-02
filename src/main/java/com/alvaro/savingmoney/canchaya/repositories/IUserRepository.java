package com.alvaro.savingmoney.canchaya.repositories;

import com.alvaro.savingmoney.canchaya.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

}
