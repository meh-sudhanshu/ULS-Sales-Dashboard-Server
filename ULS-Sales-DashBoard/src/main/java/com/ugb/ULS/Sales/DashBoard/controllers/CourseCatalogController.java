package com.ugb.ULS.Sales.DashBoard.controllers;


import com.ugb.ULS.Sales.DashBoard.models.CourseCatalog;
import com.ugb.ULS.Sales.DashBoard.services.CourseCatalogService;
import com.ugb.ULS.Sales.DashBoard.utility.ErrorMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/courseCatalog")
public class CourseCatalogController {

    @Autowired
    private CourseCatalogService courseCatalogService;

    @Autowired
    private ErrorMapping errorMapping;

    @PostMapping("/save")
    public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody CourseCatalog courseCatalog , BindingResult result){
        var requestBodyError = errorMapping.validate(result);

        if(requestBodyError != null){
            return  requestBodyError;
        }
        var savedCourseCatalog = courseCatalogService.saveOrUpdate(courseCatalog);

        return  new ResponseEntity<>(savedCourseCatalog,HttpStatus.CREATED);
    }

    @GetMapping("/getAllCourses")
    public Iterable<CourseCatalog> getAllCourses(){
        return  courseCatalogService.getAllCourses();
    }

}
