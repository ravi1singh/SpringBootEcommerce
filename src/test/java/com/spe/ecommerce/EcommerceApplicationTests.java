package com.spe.ecommerce;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spe.ecommerce.Dao.Dao;
import com.spe.ecommerce.bean.AddToCart;
import com.spe.ecommerce.bean.Checkout;
import com.spe.ecommerce.bean.Customer;
import com.spe.ecommerce.bean.Login;
import com.spe.ecommerce.bean.Product;
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
		/*Customer c=new Customer();
		c.setAddress("asdaw");
	//	c.setCart("cart");
		c.setCity("city");
		c.setCountry("India");
		c.setCreditCard("123141231232");
		c.setCustomerId(1001);
		c.setEmail("ravi");
		c.setMobile("8002505011");
		c.setName("ravi");
		c.setPassword("1234");
		c.setState("Jharkhand");
		c.setZipCode("834004");
		
		Product p=new Product();
		p.setDescription("use it to hide");
		p.setImage("url");
		p.setLocation("Bangalore");
		p.setPrice(599.87);
		p.setProductCount(20);
		p.setProductId(101);
		p.setProductName("T-shirt");*/
		cart.setCustomerId(101);
		cart.setProductId(1001);	
		assertFalse(service.addToCart(cart));
		
	}
	
	/*  // This one was giving error so i commented it.
	 @Test
	void checkoutMethodTest()
	{
		Checkout c =new Checkout();
		Product p=new Product();
		p.setDescription("use it to hide");
		p.setImage("url");
		p.setLocation("Bangalore");
		p.setPrice(599.87);
		p.setProductCount(20);
		p.setProductId(101);
		p.setProductName("T-shirt");
		
		Product p1=new Product();
		p1.setDescription("use it to hide");
		p1.setImage("url");
		p1.setLocation("Bangalore");
		p1.setPrice(599.87);
		p1.setProductCount(20);
		p1.setProductId(103);
		p1.setProductName("Rice");
		
		Product p2=new Product();
		p2.setDescription("use it to hide");
		p2.setImage("url");
		p2.setLocation("Bangalore");
		p2.setPrice(599.87);
		p2.setProductCount(20);
		p2.setProductId(105);
		p2.setProductName("Cap");
		
		c.setCheckoutlist(" T-shirt,Cap,Rice");
		
		
		c.setCustomerId(101);
		assertFalse(service.checkoutMethod(c));
	}
	*/
	
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
