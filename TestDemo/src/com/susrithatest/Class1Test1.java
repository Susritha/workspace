package com.susrithatest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.susritha.Class1;

public class Class1Test1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("hii");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testadd() {
		Class1 c1 = new Class1();
		assertEquals(8,c1.add(5,3));
		
	}

}
