package com.ugb.ULS.Sales.DashBoard.services;


import com.ugb.ULS.Sales.DashBoard.models.ProfitReport;
import com.ugb.ULS.Sales.DashBoard.repositories.ProfitReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfitReportService {

    @Autowired
    private ProfitReportRepository profitReportRepository;


    public ProfitReport saveOrUpdate(ProfitReport profitReport){
        return  profitReportRepository.save(profitReport);
    }


}
