package com.ugb.ULS.Sales.DashBoard.repositories;

import com.ugb.ULS.Sales.DashBoard.models.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice,Long> {
}
