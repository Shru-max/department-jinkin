package com.example.demo.rest;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {
    private DepartmentService departmentService;
    private DepartmentDao departmentDao;
@Autowired
    public DepartmentController(DepartmentService departmentService, DepartmentDao departmentDao) {
        this.departmentService = departmentService;
        this.departmentDao = departmentDao;
    }

    @PostMapping("/departments")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department)
    {
        return new ResponseEntity<Department>(departmentService.createDepartment(department), HttpStatus.CREATED);
    }
    @GetMapping("/departments")
    public ResponseEntity<List<Department>> displayAll()
    {
        return new ResponseEntity<List<Department>>(departmentService.displayAllDepartment(),HttpStatus.OK);
    }
    @GetMapping("/findbyid/{id}")
    public List<Department> findById(@PathVariable Integer id)
    {
        return departmentService.findByDepartmentId(id);
    }
    @GetMapping("/removeall")
            public void removeall()
    {
        departmentDao.deleteAll();
        System.out.println("DELTED ALL DATA!!");

    }
    @GetMapping("/findbyname/{dname}")
    public List<Department> findbyname(@PathVariable String dname)
    {
        return departmentDao.findByDepartmentName(dname);
    }

}
