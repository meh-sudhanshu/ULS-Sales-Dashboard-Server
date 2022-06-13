package com.ugb.ULS.Sales.DashBoard.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Invoice {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String invoiceNumber;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String courseName;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String gst;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String fees;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String bdmName;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String paymentSource;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getBdmName() {
        return bdmName;
    }

    public void setBdmName(String bdmName) {
        this.bdmName = bdmName;
    }

    public String getPaymentSource() {
        return paymentSource;
    }

    public void setPaymentSource(String paymentSource) {
        this.paymentSource = paymentSource;
    }
}
