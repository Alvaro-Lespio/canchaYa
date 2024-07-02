package com.alvaro.savingmoney.canchaya.repositories;

import com.alvaro.savingmoney.canchaya.entities.Reservation;
import com.alvaro.savingmoney.canchaya.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepostitory extends JpaRepository<Reservation,Long>{
}
