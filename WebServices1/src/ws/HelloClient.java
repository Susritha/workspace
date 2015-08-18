package ws;

public class HelloClient {
public static void main(String args[]){
	HelloWorldImplService service = new HelloWorldImplService();
	HelloWorld world = service.getHelloWorldImplPort();
	System.out.println(world.sayHello("susritha"));
	System.out.println(world.add(20,20));
}
}
