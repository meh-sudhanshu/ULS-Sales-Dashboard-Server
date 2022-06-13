package com.ugb.ULS.Sales.DashBoard.controllers;


import com.ugb.ULS.Sales.DashBoard.models.Reference;
import com.ugb.ULS.Sales.DashBoard.services.ReferenceService;
import com.ugb.ULS.Sales.DashBoard.utility.ErrorMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/reference")
@CrossOrigin
public class ReferenceController {

    @Autowired
    private ReferenceService referenceService;

    @Autowired
    private ErrorMapping errorMapping;

    @PostMapping("/save")
    public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody Reference reference , BindingResult result){

        var validatedResult = errorMapping.validate(result);

        if(validatedResult != null){
            return validatedResult;
        }


        var savedReference = referenceService.saveOrUpdate(reference);

        return new ResponseEntity<>(savedReference , HttpStatus.CREATED);

    }



}
