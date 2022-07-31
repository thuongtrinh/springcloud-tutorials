package com.txt.eurekaclient.controller;

import com.txt.eurekaclient.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeServiceController {

    private static final Map<Integer, Employee> employeeData = new HashMap<Integer, Employee>() {
        {
            put(111, new Employee(111, "Smith"));
            put(222, new Employee(222, "Alice"));
        }
    };

    @RequestMapping(value = "/findEmployeeDetails/{employeeId}", method = RequestMethod.GET)
    public Employee getEmployeeDetails(@PathVariable int employeeId) {
        System.out.println("Getting Employee details for " + employeeId);

        Employee employee = employeeData.get(employeeId);
        if (employee == null) {
            employee = new Employee(0, "N/A");
        }
        return employee;
    }

    @RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
    public Map<Integer, Employee> getEmployeeDetails() {
        System.out.println("Getting Employee list" );
        return employeeData;
    }
}
