package controllers;

import java.util.List;

public interface EmployeeDAO {
public void getDBConnection();
public void closeConn();
public void addEmployee(Employee employee);
List<Employee> getEmployees();
public void updateEmployee(int code,double sal);
}
