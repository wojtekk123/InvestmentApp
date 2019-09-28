package com.example.InvestmentApp.Dao;

import com.example.InvestmentApp.Dao.Entity.Investment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface InvestmentRepo extends CrudRepository<Investment,Long>
{

}
