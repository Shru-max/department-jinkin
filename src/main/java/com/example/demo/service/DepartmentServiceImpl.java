package com.example.demo.service;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDao departmentDao;
@Autowired
    public DepartmentServiceImpl(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override
    public Department createDepartment(Department department) {
         return departmentDao.save(department);
    }

    @Override
    public List<Department> displayAllDepartment() {
        return departmentDao.findAll();
    }

    @Override
    public List<Department> findByDepartmentId(Integer id) {
        return departmentDao.findByDepartmentId(id);
    }

    @Override
    public List<Department> findByDepartmentName(String dname) {
        return departmentDao.findByDepartmentName(dname);
    }
}
