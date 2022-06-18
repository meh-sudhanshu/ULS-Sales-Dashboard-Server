package com.ugb.ULS.Sales.DashBoard.controllers;


import com.ugb.ULS.Sales.DashBoard.models.Licence;
import com.ugb.ULS.Sales.DashBoard.services.LicenceService;
import com.ugb.ULS.Sales.DashBoard.utility.ErrorMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/licence")
@CrossOrigin
public class LicenceController {

    @Autowired
    private LicenceService licenceService;

    @Autowired
    private ErrorMapping errorMapping;

    @PostMapping("/save")
    public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody Licence licence , BindingResult result){

        var requestBodyError = errorMapping.validate(result);

        if(requestBodyError != null){
            return requestBodyError;
        }

        var savedLicence = licenceService.saveOrUpdate(licence);

        return  new ResponseEntity<>(savedLicence , HttpStatus.CREATED);
    }

    @GetMapping("/getAllLicences")
    public  Iterable<Licence> getAllLicences(){return licenceService.getAllLicence();}
}
