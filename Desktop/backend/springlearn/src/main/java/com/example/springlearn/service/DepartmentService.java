package com.example.springlearn.service;

import com.example.springlearn.entity.Department;

import java.util.List;

public interface DepartmentService {
   public  Department saveDepartment(Department department);

    List<Department> fetchAllDepartment();
    public Department fetchDepartmentById(Long departmentId);
}
