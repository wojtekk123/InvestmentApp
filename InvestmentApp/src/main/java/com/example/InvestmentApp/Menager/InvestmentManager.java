package com.example.InvestmentApp.Menager;

import com.example.InvestmentApp.Dao.Entity.Investment;
import com.example.InvestmentApp.Dao.InvestmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class InvestmentManager {

    @Autowired
    private InvestmentRepo investmentRepo;

    public Optional<Investment> findById(Long id){
        return investmentRepo.findById(id);
    }

    public Iterable<Investment> findAll() {
        return investmentRepo.findAll();
    }

    public Investment save(Investment investment) {
        return investmentRepo.save(investment);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {

        save( new Investment(1L,"first",0.04, LocalDate.of(2003,1,3),LocalDate.of(2004,2,1)));
        save( new Investment(2L,"sec",0.04, LocalDate.of(2003,1,3),LocalDate.of(2004,2,1)));

    }



}
