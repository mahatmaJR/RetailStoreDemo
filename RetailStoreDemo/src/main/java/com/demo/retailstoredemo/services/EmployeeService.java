package com.demo.retailstoredemo.services;

import com.demo.retailstoredemo.models.EmployeeDetail;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    List<EmployeeDetail> listEmployees = new ArrayList<>(

            Arrays.asList(
                    new EmployeeDetail(1, "Daniel", "Ndolo", "Admin", "IT"),
                    new EmployeeDetail(2, "Valarie", "Jwenge", "CEO", "Admin"),
                    new EmployeeDetail(3, "Victor", "Maingi", "Reception", "Admin"),
                    new EmployeeDetail(5, "Elsie", "Simiyu", "Agent", "Marketing")
            )


    );

    public EmployeeDetail saveEmployee(EmployeeDetail employeeDetail){
        listEmployees.add(employeeDetail);
        return employeeDetail;
    }

    public EmployeeDetail editEmployee(Integer id, EmployeeDetail employee){
        for (int i = 0; i < listEmployees.size(); i++){
            EmployeeDetail employ = listEmployees.get(i);
            if(employ.getId().equals(id)){
                listEmployees.set(i, employee);
            }
        }
        return employee;
    }

    public List<EmployeeDetail> allEmployees(){
        return listEmployees;
    }

    public EmployeeDetail getEmployee(Integer id){
        return (EmployeeDetail) listEmployees.stream().filter(employee -> employee.getId().equals(id));
    }

    public void deleteEmployee(Integer id){
        for (int i = 0; i < listEmployees.size(); i++){
            EmployeeDetail employee = listEmployees.get(i);
            if(employee.getId().equals(id)){
                listEmployees.remove(employee);
            }
        }
    }
}
