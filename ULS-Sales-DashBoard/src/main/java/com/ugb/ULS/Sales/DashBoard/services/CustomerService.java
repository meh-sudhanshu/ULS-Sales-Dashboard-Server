package com.ugb.ULS.Sales.DashBoard.services;


import com.ugb.ULS.Sales.DashBoard.models.Customer;
import com.ugb.ULS.Sales.DashBoard.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public Customer saveOrUpdate(Customer customer){
        return customerRepository.save(customer);
    }

    public Iterable<Customer> getAllCustomer(){
        return  customerRepository.findAll();
    }
}
