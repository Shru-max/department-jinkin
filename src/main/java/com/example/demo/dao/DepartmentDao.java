package com.example.demo.dao;

import com.example.demo.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentDao extends MongoRepository<Department,Integer> {
    @Query
    public List<Department> findByDepartmentId(Integer id);
    @Query
    public List<Department> findByDepartmentName(String dname);
    @Query
    public List<Department> findByEmployeeName(String ename);
}
