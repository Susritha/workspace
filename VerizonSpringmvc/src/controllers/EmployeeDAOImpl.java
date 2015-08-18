package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class EmployeeDAOImpl implements EmployeeDAO {
  private Connection conn;
  private PreparedStatement pst;
  private ResultSet rs;
public void getDBConnection() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try {
			 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
}
public void closeConn() {
	try {
		conn.close();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}

	
}
public void addEmployee(Employee employee) {
	getDBConnection();
	String query = "insert into employee values(?,?,?)";
	try {
		pst=conn.prepareStatement(query);
		pst.setInt(1,employee.getEmpcode());
		pst.setString(2, employee.getEname());
		pst.setDouble(3, employee.getSalary());
		pst.executeUpdate();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
	closeConn();
	}
	
	
}
public List<Employee> getEmployees() {
	getDBConnection();
	Employee emp;
	List<Employee> empls = new ArrayList<Employee>();
	try {
		pst=conn.prepareStatement("select * from employee");
		rs=pst.executeQuery();
		while(rs.next()){
			emp=new Employee();
			emp.setEmpcode(rs.getInt("empcode"));
			emp.setEname(rs.getString("ename"));
			emp.setSalary(rs.getDouble(3));
			empls.add(emp);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally{
		closeConn();
	}
	
	return empls;
}
public void updateEmployee(int code, double sal) {
	getDBConnection();
	
	try
	{
	String query="UPDATE employee set SALARY="+sal+"where empcode="+code;
	pst=conn.prepareStatement(query);
	pst.executeUpdate();
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		closeConn();
	}
}
	
}
  
  


