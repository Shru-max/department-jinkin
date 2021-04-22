package com.example.demo.service;

import com.example.demo.model.Department;

import java.util.List;

public interface DepartmentService {

    public Department createDepartment(Department department);
    public List<Department> displayAllDepartment();
    public List<Department> findByDepartmentId(Integer id);
    public List<Department> findByDepartmentName(String dname);
    public List<Department> findByEmployeeName(String ename);
}

