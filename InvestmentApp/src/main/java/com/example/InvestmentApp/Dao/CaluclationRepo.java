package com.example.InvestmentApp.Dao;

import com.example.InvestmentApp.Dao.Entity.Calculation;
import org.springframework.data.repository.CrudRepository;

public interface CaluclationRepo extends CrudRepository<Calculation,Long> {
}
