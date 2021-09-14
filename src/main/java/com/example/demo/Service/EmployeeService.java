package com.example.demo.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }
    public void updateEmployee(Employee employee){
        employeeRepository.save(employee);
    }
    public void deleteEmployee(long id){
        employeeRepository.deleteById(id);
    }
}
