package Testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.javatpoint.feereport.AddAccountant;

class logintest {

	@Test
	public void validSignUpTest() {
		String username = "vijay";
		String password = "vijayg";
		String mobile="7218656565";
		String email="vijaygate@gmail.com";
		
		Assert.assertEquals(true, AddAccountant.signUp(username, password,email,mobile));
		System.out.println("SignUp test case passed\n");
	}
	
}
