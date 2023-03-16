package net.javaguidesemployeeservice.service;

import lombok.AllArgsConstructor;
import net.javaguidesemployeeservice.dto.APIResponseDto;
import net.javaguidesemployeeservice.dto.EmployeeDto;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long id);
}
