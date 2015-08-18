package com.susrithatest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.susritha.Class1;

public class Class1Test {
 Class1 c1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("Set up class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("Tear down Class");
	}
	

	@Before
	public void setUp() throws Exception {
		c1=new Class1();
		System.out.println("Memory Created");
	}

	@After
	public void tearDown() throws Exception {
		c1=null;
		System.out.println("Memory released");
	}

	@Test
	public void testadd() {
		
		assertEquals(5,c1.add(2,3));
		}
	@Test
public void testsub(){
	
	assertEquals(6, c1.sub(9,3));
}
}
