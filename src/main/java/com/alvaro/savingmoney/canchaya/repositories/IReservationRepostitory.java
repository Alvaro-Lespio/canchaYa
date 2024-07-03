package com.alvaro.savingmoney.canchaya.repositories;

import com.alvaro.savingmoney.canchaya.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationRepostitory extends JpaRepository<Booking,Long>{
}
