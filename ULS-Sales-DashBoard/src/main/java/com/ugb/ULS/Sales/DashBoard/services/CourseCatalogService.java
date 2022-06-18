package com.ugb.ULS.Sales.DashBoard.services;


import com.ugb.ULS.Sales.DashBoard.models.CourseCatalog;
import com.ugb.ULS.Sales.DashBoard.repositories.CourseCatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseCatalogService {

    @Autowired
    private CourseCatalogRepository courseCatalogRepository;

    public CourseCatalog saveOrUpdate(CourseCatalog courseCatalog){
        return courseCatalogRepository.save(courseCatalog);
    }

    public Iterable<CourseCatalog> getAllCourses(){
        return courseCatalogRepository.findAll();
    }

}
