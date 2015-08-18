package Jdbcpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		PrintWriter pw=response.getWriter();
		pw.println("in update operations");
		int code=Integer.parseInt(request.getParameter("empcode"));
		double newsal=Double.parseDouble(request.getParameter("nsalary"));
		Employee emp=new Employee();
		emp.setEmpcode(code);
		EmployeeDAOImpl dao=new EmployeeDAOImpl();
		dao.updateEmployee(code, newsal);
		pw.println("Records Updated");
		
		
		
	}

	

}
