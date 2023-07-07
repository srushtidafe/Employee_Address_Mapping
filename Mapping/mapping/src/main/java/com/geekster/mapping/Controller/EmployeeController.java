package com.geekster.mapping.Controller;

import com.geekster.mapping.Service.EmployeeService;
import com.geekster.mapping.model.Address;
import com.geekster.mapping.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
   @Autowired
   EmployeeService employeeService;

   @GetMapping("/Employee")
   public Iterable<Employee> getAllEmployee(){
      return employeeService.getAllEmployee();
   }
   @GetMapping(value = "/Employee/EmployeeId/{employeeId}")
   public Iterable<Employee> getEmployeeById(@PathVariable Iterable<Long> employeeId){
      return employeeService.getEmployeeById(employeeId);
   }
   @PostMapping("Employee")
   public String addEmployee(@RequestBody Employee employee){
      employeeService.addEmployee(employee);
      return "Added";
   }
   @PostMapping("Employee/All")
   public String addAllEmployee(@RequestBody Iterable<Employee> employee){
      employeeService.addAllEmployee(employee);
      return "Added";
   }
   @PutMapping("Employee/{employeeId}")
   public String updateEmployeeById(@PathVariable Long employeeId){
      employeeService.updateEmployeeById(employeeId);
      return "updated";
   }
   @DeleteMapping("Employee")
   public String deleteEmployee(Employee employee){
      employeeService.deleteEmployee(employee);
      return "Deleted";
   }

}
