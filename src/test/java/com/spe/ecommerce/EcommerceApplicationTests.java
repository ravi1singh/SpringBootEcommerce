package com.spe.ecommerce;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spe.ecommerce.bean.AddToCart;
import com.spe.ecommerce.bean.Checkout;
import com.spe.ecommerce.bean.Customer;
import com.spe.ecommerce.bean.Login;
import com.spe.ecommerce.service.Service;

@SpringBootTest
@RunWith(SpringRunner.class)
class EcommerceApplicationTests {
    @Autowired
	Service service;
	
	@Test
	void validateUserTest() {
		Login login=new Login();
		login.setEmail("ravi");
		login.setPassword("1234");
		assertNotNull(service.validateUser(login));
	}
	
	@Test
	void addToCartTest()
	{
		AddToCart cart=new AddToCart();
		cart.setCustomerId(1001);
		cart.setProductId(101);	
		assertTrue(service.addToCart(cart));
		
	}
	 // This one was giving error so i commented it.
	 @Test
	void checkoutMethodTest()
	{
		Checkout c =new Checkout();
		
		//asjbaid
		c.setCustomerId(1001);
		c.setCheckoutlist("[102]");
		assertTrue(service.checkoutMethod(c));
	}
	
	
	@Test
	void registerCustomerTest()
	{
		Customer c=new Customer();
		c.setAddress("asdaw");
	//	c.setCart("cart");
		c.setCity("city");
		c.setCountry("India");
		c.setCreditCard("123141231232");
		c.setCustomerId(1001);
		c.setEmail("ravi");
		c.setMobile("8002505011");
		c.setName("ravi");
		c.setPassword("12345");
		c.setState("Jharkhand");
		c.setZipCode("834004");
		
		assertFalse(!(service.registerCustomer(c)));
	}
}
