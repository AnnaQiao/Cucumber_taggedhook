package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class taggedHooksStepDefiniation {
	// Global hooks
    @Before()
    public void setup()
    {
    	System.out.println("this will run before the every Scenario");
    }
    @After()
    public void teardown()
    {
    	System.out.println("this will run after the every Scenario");
    }
    //local -for the first scenario
    @Before("@First")
    public void setup1()
    {
    	System.out.println("---------------start of the first scenario-----------------");
    }
    @After("@First")
    public void teardown1()
    {
    	System.out.println("---------------end of the first scenario-----------------");
    }
    //local -for the second&third scenario
    @Before("@Second,@Third")
    public void setup4()
    {
    	System.out.println("---------------start of the 2&3 scenario-----------------");
    }
    @After("@Second,@Third")
    public void teardown4()
    {
    	System.out.println("---------------end of the 2&3 scenario-----------------");
    }
    
    @Given("^this is the first step$")
	public void this_is_the_first_step()
    {
		System.out.println("the first step");
		
	}

	@When("^this is the second step$")
	public void this_is_the_second_step()
	{
		System.out.println("the second step");
	}
	
	@Then("^this is the third step$")
	public void this_is_the_third_step() 
	{
		System.out.println("the third step");
	}
}
