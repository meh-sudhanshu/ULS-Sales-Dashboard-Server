package com.ugb.ULS.Sales.DashBoard.services;


import com.ugb.ULS.Sales.DashBoard.models.Licence;
import com.ugb.ULS.Sales.DashBoard.repositories.LicenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenceService {

    @Autowired
    private LicenceRepository licenceRepository;


    public Licence saveOrUpdate(Licence licence){
        return licenceRepository.save(licence);
    }

    public Iterable<Licence> getAllLicence(){
        return  licenceRepository.findAll();
    }
}
