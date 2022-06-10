package com.ugb.ULS.Sales.DashBoard.controllers;


import com.ugb.ULS.Sales.DashBoard.models.Customer;
import com.ugb.ULS.Sales.DashBoard.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody Customer customer , BindingResult result){

        if(result.hasErrors()){
            Map<String , String> errorMap = new HashMap<>();
            for(FieldError error : result.getFieldErrors()){
                errorMap.put(error.getField() ,error.getDefaultMessage());
            }
            return new ResponseEntity<>(errorMap , HttpStatus.BAD_REQUEST);
        }

        return  new ResponseEntity<>(customerService.saveOrUpdate(customer) , HttpStatus.CREATED);

    }

}
