package com.ssjethwa.springSec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity
public class Customer {
//    @Id
    private int custId;
    private String name;

    public Customer(int custId, String name) {
        this.custId = custId;
        this.name = name;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
