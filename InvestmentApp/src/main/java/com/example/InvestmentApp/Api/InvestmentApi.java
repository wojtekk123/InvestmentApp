package com.example.InvestmentApp.Api;

import com.example.InvestmentApp.Dao.Entity.DataToSend;
import com.example.InvestmentApp.Dao.Entity.Investment;
import com.example.InvestmentApp.Menager.ResultManager;
import com.example.InvestmentApp.Menager.InvestmentManager;
import com.example.InvestmentApp.Dao.Entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class InvestmentApi {


    @Autowired
    private InvestmentManager investmentManager;

    @Autowired
    private ResultManager resultManager;



    @GetMapping("/investment")
    public  Iterable<Investment> getAll() {
        return investmentManager.findAll();

    }
    @PutMapping("/investment/add")
    public Investment addInvestment (@RequestBody Investment investment){

        return investmentManager.save(investment);
    }

    @PostMapping("/investment/{id}/calculate")
    public Result countInvestment(@PathVariable (value = "id") Long id,
                                  @RequestBody DataToSend dataToSend
                                  ){

        Result result = resultManager.calculate(id, dataToSend.getAmount(),dataToSend.getTypeAlgorithm());

    return result;
    }


}
