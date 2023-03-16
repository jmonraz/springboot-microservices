package net.javaguidesemployeeservice.repository;

import net.javaguidesemployeeservice.dto.EmployeeDto;
import net.javaguidesemployeeservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
