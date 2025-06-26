package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ems")
public class EmpController {

    @Autowired
    public EmpService empService;

    @PostMapping
    public Employee createEmp(@RequestBody Employee emp) {
        return empService.saveEmp(emp);
    }
}