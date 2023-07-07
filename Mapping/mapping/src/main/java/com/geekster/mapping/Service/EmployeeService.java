package com.geekster.mapping.Service;

import com.geekster.mapping.Repository.IEmployeeRepository;
import com.geekster.mapping.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepository employeeRepository;

    public Iterable<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Iterable<Employee> getEmployeeById(Iterable<Long> employeeId) {
        return employeeRepository.findAllById(employeeId);
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void addAllEmployee(Iterable<Employee> employee) {
        employeeRepository.saveAll(employee);
    }

    public void updateEmployeeById(Long employeeId) {
        employeeRepository.updateEmployeeById(employeeId);
    }

    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }
}
