package com.ugb.ULS.Sales.DashBoard.services;


import com.ugb.ULS.Sales.DashBoard.models.Trainer;
import com.ugb.ULS.Sales.DashBoard.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {


    @Autowired
    private TrainerRepository trainerRepository;


    public Trainer saveOrUpdate(Trainer trainer){
        return trainerRepository.save(trainer);
    }

    public Iterable<Trainer> getAllTrainers(){return  trainerRepository.findAll();}

}
