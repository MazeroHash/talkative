package com.example.springlearn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    private String departmentName;
    private String departmentAddess;
    private String departmentCode;

    public String getDepartmentAddess() {
        return departmentAddess;
    }

    public void setDepartmentAddess(String departmentAddess) {
        this.departmentAddess = departmentAddess;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public Department(long departmentId, String departmentName, String departmentAddess, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddess = departmentAddess;
        this.departmentCode = departmentCode;
    }
    public Department(){}


    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddess='" + departmentAddess + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }



}
