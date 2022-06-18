package com.ugb.ULS.Sales.DashBoard.controllers;


import com.ugb.ULS.Sales.DashBoard.models.Trainer;
import com.ugb.ULS.Sales.DashBoard.services.TrainerService;
import com.ugb.ULS.Sales.DashBoard.utility.ErrorMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/trainer")
@CrossOrigin
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    @Autowired
    private ErrorMapping errorMapping;

    @PostMapping("/save")
    public ResponseEntity<?>  saveOrUpdate(@Valid @RequestBody Trainer trainer, BindingResult result){

        var requestBodyError = errorMapping.validate(result);

        if(requestBodyError != null){
            return requestBodyError;
        }


        var savedTrainer = trainerService.saveOrUpdate(trainer);

        return  new ResponseEntity<>(trainer , HttpStatus.CREATED);
    }

    @GetMapping("/getAllTrainers")
    public Iterable<Trainer> getAllTrainers(){
        return trainerService.getAllTrainers();
    }

}
