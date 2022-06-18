package com.ugb.ULS.Sales.DashBoard.controllers;


import com.ugb.ULS.Sales.DashBoard.models.ProfitReport;
import com.ugb.ULS.Sales.DashBoard.services.ProfitReportService;
import com.ugb.ULS.Sales.DashBoard.utility.ErrorMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/profitReport")
public class ProfitReportController {


    @Autowired
    private ProfitReportService profitReportService;

    @Autowired
    private ErrorMapping errorMapping;

    @PostMapping("/save")
    public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody ProfitReport profitReport, BindingResult result){
        var requestBodyError = errorMapping.validate(result);

        if(requestBodyError != null){
            return requestBodyError;
        }

        var savedReport = profitReportService.saveOrUpdate(profitReport);

        return  new ResponseEntity<>(savedReport , HttpStatus.CREATED);
    }


    @GetMapping("/getAllProfitReports")
    public Iterable<ProfitReport> getAllProfitReports(){
        return profitReportService.getAllProfitReports();
    }

}
