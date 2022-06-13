package com.ugb.ULS.Sales.DashBoard.controllers;


import com.ugb.ULS.Sales.DashBoard.models.ProfitReport;
import com.ugb.ULS.Sales.DashBoard.services.ProfitReportService;
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


    @PostMapping("/save")
    public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody ProfitReport profitReport, BindingResult result){
        if(result.hasErrors()){
            Map<String, String > errorMap = new HashMap<>();

            for(FieldError error : result.getFieldErrors()){
                errorMap.put(error.getField() , error.getDefaultMessage());
            }

            return new ResponseEntity<>(errorMap , HttpStatus.BAD_REQUEST);

        }

        ProfitReport savedReport = profitReportService.saveOrUpdate(profitReport);

        return  new ResponseEntity<>(savedReport , HttpStatus.CREATED);
    }


}
