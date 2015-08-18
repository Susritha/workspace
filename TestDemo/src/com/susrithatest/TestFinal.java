package com.susrithatest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestFinal {

	public static void main(String args[]){
		
		
	Result rs = JUnitCore.runClasses(MedianTest.class);
	for(Failure f:rs.getFailures()){
		System.out.println(" Error is "+f.toString());
	}
	System.out.println(""+rs.wasSuccessful());
	}
}
