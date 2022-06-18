package com.ugb.ULS.Sales.DashBoard.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Licence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String toolName;

    private String validityDate;

    private String amount;

    private String renewalDate;

    private String purchasedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(String renewalDate) {
        this.renewalDate = renewalDate;
    }

    public String getPurchasedBy() {
        return purchasedBy;
    }

    public void setPurchasedBy(String purchasedBy) {
        this.purchasedBy = purchasedBy;
    }
}
