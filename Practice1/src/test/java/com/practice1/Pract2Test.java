package com.practice1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pract2Test {
	@Test
	public void createPrct4()
	{
		Reporter.log("crerate pract4",true);
	}
	@Test
	public void createPract5()
	{
		Reporter.log("create pract5",true);
	}
	@Test
	public void createTest6()
	{
		String url = System.getProperty("url");
		String username = System.getProperty("USERNAME");
		String password = System.getProperty("PASSWORD");
		
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("USERNAME"));
		System.out.println(System.getProperty("PASSWORD"));


		System.out.println("pract");
		
		
		


		
	}

}
