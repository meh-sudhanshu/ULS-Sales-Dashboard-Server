package com.ugb.ULS.Sales.DashBoard.controllers;


import com.ugb.ULS.Sales.DashBoard.models.ProfitReport;
import com.ugb.ULS.Sales.DashBoard.services.ProfitReportService;
import com.ugb.ULS.Sales.DashBoard.utility.ErrorMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/profitReport")
public class ProfitReportController {


    @Autowired
    private ProfitReportService profitReportService;

    @Autowired
    private ErrorMapping errorMapping;

    @PostMapping("/save")
    public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody ProfitReport profitReport, BindingResult result){
        var validatedResult = errorMapping.validate(result);

        if(validatedResult != null){
            return validatedResult;
        }

        var savedReport = profitReportService.saveOrUpdate(profitReport);

        return  new ResponseEntity<>(savedReport , HttpStatus.CREATED);
    }


}
