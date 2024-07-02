package com.alvaro.savingmoney.canchaya.repositories;

import com.alvaro.savingmoney.canchaya.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface IReservationRepostitory extends JpaRepository<Reservation,Long>{
}
