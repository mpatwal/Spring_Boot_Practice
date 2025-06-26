package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ems")
public class EmpController {

    @Autowired
    public EmpService empService;

    @PostMapping
    public Employee createEmp(@RequestBody Employee emp) {
        return empService.saveEmp(emp);
    }
    @GetMapping
    public List<Employee> getAllEmp(){
        return empService.getAllEmp();
    }
    @GetMapping("/{id}")
    public Employee getEmpById(@PathVariable Long id){
        return empService.getEmpById(id);
    }


}