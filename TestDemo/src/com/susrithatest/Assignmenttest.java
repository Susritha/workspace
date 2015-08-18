package com.susrithatest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.susritha.Assignment;

public class Assignmenttest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tear Down");
	}

	@Test
	public void testfindlarge() {
		Assignment a = new Assignment();
		int [] b={-1,-5,-2,-4};
		assertEquals(-1, a.findlarge(b));
	}

}
