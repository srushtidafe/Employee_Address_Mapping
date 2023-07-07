package com.geekster.mapping.Repository;

import com.geekster.mapping.model.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee,Long> {
    @Modifying
    @Transactional
    @Query(value = "update Employee where EMPLOYEE_ID=:employeeId", nativeQuery = true)
    void updateEmployeeById(Long employeeId);
}
