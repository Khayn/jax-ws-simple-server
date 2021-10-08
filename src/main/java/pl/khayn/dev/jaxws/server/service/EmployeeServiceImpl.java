package pl.khayn.dev.jaxws.server.service;

import jakarta.jws.WebService;
import pl.khayn.dev.jaxws.server.domain.Employee;

@WebService
public class EmployeeServiceImpl implements EmployeeService{

    public Employee getEmployeeById(String id) {
        return new Employee("1", "Adam Gad");
    }
}
