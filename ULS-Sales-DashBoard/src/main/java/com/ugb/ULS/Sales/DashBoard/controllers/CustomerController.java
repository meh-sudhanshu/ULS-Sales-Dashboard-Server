package com.ugb.ULS.Sales.DashBoard.controllers;


import com.ugb.ULS.Sales.DashBoard.models.Customer;
import com.ugb.ULS.Sales.DashBoard.services.CustomerService;
import com.ugb.ULS.Sales.DashBoard.utility.ErrorMapping;
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

    @Autowired
    private ErrorMapping errorMapping;
    @PostMapping("/save")
    public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody Customer customer , BindingResult result){

        var validatedResult = errorMapping.validate(result);

        if(validatedResult != null){
            return validatedResult;
        }

        var savedCustomer = customerService.saveOrUpdate(customer);

        return  new ResponseEntity<>(savedCustomer , HttpStatus.CREATED);

    }

}
