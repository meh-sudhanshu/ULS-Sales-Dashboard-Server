package com.ugb.ULS.Sales.DashBoard.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Size(min = 3 , max = 20 , message = "Name length should be between 3 to 20")
    private String name;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Pattern(regexp="(^$|[0-9]{10})" , message = "please provide a valid mobile number")
    private String mobileNumber;

    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Email(message = "Please provide a valid email address")
    private  String emailId;


    @NotBlank(message = "can not be blank")
    @NotNull(message = "can not be null")
    @Pattern(regexp="(^$|[0-9]{10})" , message = "please provide a valid mobile number")
    private String alternateMobileNumber;



    private ArrayList<String> specialisedCourses;

    @Size(min = 3 , max = 100 , message = "address details length should be between 3 to 100")
    private  String addressDetails;

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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAlternateMobileNumber() {
        return alternateMobileNumber;
    }

    public void setAlternateMobileNumber(String alternateMobileNumber) {
        this.alternateMobileNumber = alternateMobileNumber;
    }

    public ArrayList<String> getSpecialisedCourses() {
        return specialisedCourses;
    }

    public void setSpecialisedCourses(ArrayList<String> specialisedCourses) {
        this.specialisedCourses = specialisedCourses;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return Objects.equals(id, trainer.id) && Objects.equals(name, trainer.name) && Objects.equals(mobileNumber, trainer.mobileNumber) && Objects.equals(emailId, trainer.emailId) && Objects.equals(alternateMobileNumber, trainer.alternateMobileNumber) && Objects.equals(specialisedCourses, trainer.specialisedCourses) && Objects.equals(addressDetails, trainer.addressDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mobileNumber, emailId, alternateMobileNumber, specialisedCourses, addressDetails);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", alternateMobileNumber='" + alternateMobileNumber + '\'' +
                ", specialisedCourses=" + specialisedCourses +
                ", addressDetails='" + addressDetails + '\'' +
                '}';
    }
}
