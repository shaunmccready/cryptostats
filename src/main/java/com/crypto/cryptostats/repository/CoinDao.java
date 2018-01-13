package com.crypto.cryptostats.repository;

import com.crypto.cryptostats.domain.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinDao extends JpaRepository<Coin, Integer>{

}
