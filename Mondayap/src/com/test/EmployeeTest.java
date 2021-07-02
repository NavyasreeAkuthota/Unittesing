package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws Exception {
		Empl emp= new Programmer("-",24);			        
	    	String actual= emp.create();
	    	String expected="created";
	    	assertEquals(expected,actual);
	    	
	   	}
	@Test
	void raiseTest() throws Exception{
		Empl emp=new Programmer("-",25);
		emp.create();
     int actual= emp.raiseSalary();
     int expected=1;
		assertEquals(expected,actual);
	}
    @Test
    void testClerk() throws Exception{
    	Empl emp= new Clerk("-",24);			        
    	String actual= emp.create();
    	String expected="created";
    	assertEquals(expected,actual);
    }
    @Test
	void raiseClerkTest() throws Exception{
		Empl emp=new Clerk("-",25);
		emp.create();
     int actual= emp.raiseSalary();
     int expected=1;
		assertEquals(expected,actual);
	}
    @Test
	void raiseManagerTest() throws Exception{
		Empl emp=new Manager("-",25);
		emp.create();
     int actual= emp.raiseSalary();
     int expected=1;
		assertEquals(expected,actual);
	}
    @Test
    void testManager() throws Exception{
    	Empl emp= new Manager("-",24);			        
    	String actual= emp.create();
    	String expected="created";
    	assertEquals(expected,actual);
    }
}