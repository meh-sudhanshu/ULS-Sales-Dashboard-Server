package com.ugb.ULS.Sales.DashBoard.controllers;


import com.ugb.ULS.Sales.DashBoard.models.Trainer;
import com.ugb.ULS.Sales.DashBoard.services.TrainerService;
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
@RequestMapping("/trainer")
@CrossOrigin
public class TrainerController {

    @Autowired
    private TrainerService trainerService;


    @PostMapping("/save")
    public ResponseEntity<?>  saveOrUpdate(@Valid @RequestBody Trainer trainer, BindingResult result){

        if(result.hasErrors()){
            Map<String , String> errorMap = new HashMap<>();

            for(FieldError error : result.getFieldErrors()){
                errorMap.put(error.getField() , error.getDefaultMessage());

            }
            return  new ResponseEntity<>(errorMap, HttpStatus.BAD_REQUEST);
        }
        Trainer savedTrainer = trainerService.saveOrUpdate(trainer);

        return  new ResponseEntity<>(trainer , HttpStatus.CREATED);
    }

}
