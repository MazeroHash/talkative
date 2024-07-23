package com.example.springlearn.controller;

import com.example.springlearn.entity.Department;
import com.example.springlearn.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class departmentController {

    @Autowired
   private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);

    }
    @GetMapping("/getDepartments")
    public List<Department> fetchAllDepartment(){
        return departmentService.fetchAllDepartment();
    }

    @GetMapping("/getDepartment/{id}")
    public Department fetchDepartmentById(@PathVariable("id")Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

}
