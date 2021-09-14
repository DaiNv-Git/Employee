package com.example.demo.Controller;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "employee")
public class HomeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("list")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @PostMapping("{id}/update")
    public void updateEmployee(@PathVariable("id") long id,@RequestBody  Employee employee){
        employeeService.updateEmployee(employee);
    }
    @PostMapping("add")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }
    @DeleteMapping("{id}/delete")
    public void deleteEmployee(@PathVariable("id") long id){
        employeeService.deleteEmployee(id);
    }
}
