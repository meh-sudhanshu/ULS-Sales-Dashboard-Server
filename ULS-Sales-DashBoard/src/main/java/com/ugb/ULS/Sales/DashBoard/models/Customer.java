package com.ugb.ULS.Sales.DashBoard.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Size(min = 3 , max = 20 , message = "Name length should be between 3 to 20")
    private String name;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Email(message = "Please provide a valid email address")
    private String emailId;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Pattern(regexp="(^$|[0-9]{10})")
    private String mobileNumber;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Size(min = 2 , max = 35 , message = "company name should be between 2 to 35")
    private String companyName;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Size(min = 3 , max = 20 , message = "course name should be between 3 to 20")
    private String courseName;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
//    @Pattern(regexp = "paid || not paid" , message = "values can only be either paid or not paid")
    private String feesPaid;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String paymentSource;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
//    @Pattern(regexp = "certified | not certified" , message = "values can only be either certified or not certified")
    private String certificationStatus;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String country;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String city;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String sourceOfLead;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
//    @Pattern(regexp = "generated | not generated" , message = "values can only be either generated or not generated")
    private String invoiceStatus;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String bdeName;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String leadStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(String feesPaid) {
        this.feesPaid = feesPaid;
    }

    public String getPaymentSource() {
        return paymentSource;
    }

    public void setPaymentSource(String paymentSource) {
        this.paymentSource = paymentSource;
    }

    public String getCertificationStatus() {
        return certificationStatus;
    }

    public void setCertificationStatus(String certificationStatus) {
        this.certificationStatus = certificationStatus;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSourceOfLead() {
        return sourceOfLead;
    }

    public void setSourceOfLead(String sourceOfLead) {
        this.sourceOfLead = sourceOfLead;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getBdeName() {
        return bdeName;
    }

    public void setBdeName(String bdeName) {
        this.bdeName = bdeName;
    }

    public String getLeadStatus() {
        return leadStatus;
    }

    public void setLeadStatus(String leadStatus) {
        this.leadStatus = leadStatus;
    }
}
