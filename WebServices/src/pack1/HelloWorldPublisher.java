package pack1;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
public static void main(String args[]){
	
	Endpoint.publish("http://localhost:1502/pack1/greet", new HelloWorldImpl());
}

}
