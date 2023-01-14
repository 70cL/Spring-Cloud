package cl.td.employeeservice.service;

import cl.td.employeeservice.dto.APIResponseDto;
import cl.td.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);

    Integer getPortFromDepartment();
}
