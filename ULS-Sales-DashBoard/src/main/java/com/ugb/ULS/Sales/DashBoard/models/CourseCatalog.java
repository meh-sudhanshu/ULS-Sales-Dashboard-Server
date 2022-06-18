package com.ugb.ULS.Sales.DashBoard.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CourseCatalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String courseName;

    private String numberOfTrainingDays;

    private String courseFees;

    private String examFees;

    private String certifiedBy;

    private String isCertificationAvailable;

    private String isTrainingMandatory;

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

    public String getNumberOfTrainingDays() {
        return numberOfTrainingDays;
    }

    public void setNumberOfTrainingDays(String numberOfTrainingDays) {
        this.numberOfTrainingDays = numberOfTrainingDays;
    }

    public String getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(String courseFees) {
        this.courseFees = courseFees;
    }

    public String getExamFees() {
        return examFees;
    }

    public void setExamFees(String examFees) {
        this.examFees = examFees;
    }

    public String getCertifiedBy() {
        return certifiedBy;
    }

    public void setCertifiedBy(String certifiedBy) {
        this.certifiedBy = certifiedBy;
    }

    public String getIsCertificationAvailable() {
        return isCertificationAvailable;
    }

    public void setIsCertificationAvailable(String isCertificationAvailable) {
        this.isCertificationAvailable = isCertificationAvailable;
    }

    public String getIsTrainingMandatory() {
        return isTrainingMandatory;
    }

    public void setIsTrainingMandatory(String isTrainingMandatory) {
        this.isTrainingMandatory = isTrainingMandatory;
    }
}
