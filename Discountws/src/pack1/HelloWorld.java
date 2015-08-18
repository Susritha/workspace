package pack1;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

// service end point interface
@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface HelloWorld {
	@WebMethod
public double calculate(double bill);
	

}

