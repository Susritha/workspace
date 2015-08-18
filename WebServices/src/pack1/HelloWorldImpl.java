package pack1;


import javax.jws.WebService;

@WebService(endpointInterface="pack1.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	@Override
	public String greetings(String name) {
	
		return "hello "+name;
	}

	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

}
