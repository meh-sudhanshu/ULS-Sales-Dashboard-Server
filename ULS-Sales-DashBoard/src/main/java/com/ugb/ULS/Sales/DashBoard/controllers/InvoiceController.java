package com.ugb.ULS.Sales.DashBoard.controllers;


import com.ugb.ULS.Sales.DashBoard.models.Invoice;
import com.ugb.ULS.Sales.DashBoard.services.InvoiceService;
import com.ugb.ULS.Sales.DashBoard.utility.ErrorMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {


    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private ErrorMapping errorMapping;


    @PostMapping("/save")
    public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody Invoice invoice , BindingResult result){
        var requestBodyError = errorMapping.validate(result);

        if(requestBodyError != null){
            return requestBodyError;
        }

        var savedInvoice = invoiceService.saveOrUpdate(invoice);

        return  new ResponseEntity<>(savedInvoice , HttpStatus.CREATED);
    }


    @GetMapping("/getAllInvoices")
    public Iterable<Invoice> getAllInvoices(){
        return invoiceService.getAllInvoice();
    }

}
