package com.pack.testingdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculator {

	Calculator c1;
	
	@Test
	public void testAdd() {
	assertEquals("Addition is not proper",40, c1.add(20,20));
	System.out.println("testAdd() checking");
	}
	
	@Test
	public void testSub() {
	assertEquals("Subtraction is not proper",40, c1.sub(60,20));
	System.out.println("testSub() checking");
	}
	
	@Test
	public void testEquals()
	{
		assertTrue("a and b are not equal",c1.compare(20, 20));
		System.out.println("testEqual() checking");
	}
	
	@Test
	public void testNotEquals()
	{
		assertFalse("a and b are  equal",c1.compare(10, 20));
		System.out.println("testNotEqual() checking");
	}
	@Before
	public void createObject()
	{
		c1=new Calculator();
		System.out.println("Object created");
	}
	

	@After
	public void removeObject()
	{
		c1=null;
		System.out.println("Object dereferenced");
	}

	@BeforeClass
	public static void abc()
	{
		System.out.println("FIRST");
	}
	
	@AfterClass
	public static void xyz()
	{
		System.out.println("LAST");
	}

}
