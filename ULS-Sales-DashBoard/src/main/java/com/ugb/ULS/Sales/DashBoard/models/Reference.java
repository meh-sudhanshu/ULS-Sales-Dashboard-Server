package com.ugb.ULS.Sales.DashBoard.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Reference {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String name;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Email(message = "please provide a valid email address")
    private String emailId;


    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Pattern(regexp="(^$|[0-9]{10})" , message = "please provide a valid mobile number")
    private String mobileNumber;


    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    private String refPoints;

    private String address;

    private  String companyName;


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

    public String getRefPoints() {
        return refPoints;
    }

    public void setRefPoints(String refPoints) {
        this.refPoints = refPoints;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
