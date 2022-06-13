package com.ugb.ULS.Sales.DashBoard.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class ProfitReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Size(min = 3 , max = 20 , message = "Name length should be between 3 to 20")
    private String courseName;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Size(min = 3 , max = 20 , message = "Name length should be between 3 to 20")
    private String name;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Email(message = "Please provide a valid email address")
    private String email;


    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Pattern(regexp="(^$|[0-9]{10})")
    private String mobileNumber;


    private String feesPaid;

    private String trainerFees;

    private String examFees;

    private String expenses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(String feesPaid) {
        this.feesPaid = feesPaid;
    }

    public String getTrainerFees() {
        return trainerFees;
    }

    public void setTrainerFees(String trainerFees) {
        this.trainerFees = trainerFees;
    }

    public String getExamFees() {
        return examFees;
    }

    public void setExamFees(String examFees) {
        this.examFees = examFees;
    }

    public String getExpenses() {
        return expenses;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses;
    }
}
