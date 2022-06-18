package com.ugb.ULS.Sales.DashBoard.services;


import com.ugb.ULS.Sales.DashBoard.models.Reference;
import com.ugb.ULS.Sales.DashBoard.repositories.ReferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Ref;

@Service
public class ReferenceService {

    @Autowired
    private ReferenceRepository referenceRepository;


    public Reference saveOrUpdate(Reference reference){
        return referenceRepository.save(reference);
    }

    public Iterable<Reference> getAllReferences(){return  referenceRepository.findAll();}

}
