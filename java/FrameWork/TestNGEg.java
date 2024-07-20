package FrameWork;

import org.testng.annotations.Test;

public class TestNGEg {

/*	@Test(priority=0)
 public void createContact()
	{
	 System.out.println("contact is created");
    }
	
	@Test(priority=1)

	public void modifyContact()
	{
	 System.out.println("contact is modified");
    }
	@Test(priority=2)

	public void deleteContact()
	{
	 System.out.println("contact is deleted");
    } */
	
	@Test
	 public void createContact()
		{
		 System.out.println("contact is created");
	    }
	
	@Test(dependsOnMethods = "createContact")
	public void modifyContact()
	{
	 System.out.println("contact is modified");
    }
	
	@Test(dependsOnMethods = "createContact")
	public void deleteContact()
	{
	 System.out.println("contact is deleted");
    } 
	
}
