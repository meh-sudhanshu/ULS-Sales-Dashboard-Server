package com.ugb.ULS.Sales.DashBoard.repositories;

import com.ugb.ULS.Sales.DashBoard.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer , Long> {
}
