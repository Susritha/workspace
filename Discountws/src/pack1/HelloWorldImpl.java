package pack1;


import javax.jws.WebService;

@WebService(endpointInterface="pack1.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	

	@Override
	public double calculate(double bill) {
		return (float) (bill-0.2*bill);

	}


}
