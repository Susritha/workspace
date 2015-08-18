package org.tempuri;

public class DotClientAppln {
public static void main(String args[]){
	Service1 service = new Service1();
	Service1Soap soap = service.getService1Soap();
	System.out.println(soap.addition(50, 5));
	System.out.println(soap.product(3, 7));
}
}
