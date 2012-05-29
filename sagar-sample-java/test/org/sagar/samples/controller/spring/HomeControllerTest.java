/**
 * 
 */
package org.sagar.samples.controller.spring;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author spras3
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/WEB-INF/spring/appServlet/servlet-context.xml"})
public class HomeControllerTest {
	
	@BeforeClass
	public static void runBeforeTestClass(){
		System.out.println("Before test class");
	}
	
	
	
	@Before
	public void runBeforeTestMethod(){
		System.out.println("Before test method");
	}

	/**
	 * Test method for {@link org.sagar.samples.controller.spring.HomeController#home()}.
	 */
	@Test
	public void testHome() {
		System.out.println("excecuting test method 1");
		HomeController homeController = new HomeController();
		ModelAndView mnv = homeController.home();
		assertEquals(mnv.getViewName(), "home");
		assertEquals((String)mnv.getModel().get("name"), "Sagar Prasad");
	}
	
	
	@Test
	public void testHome2() {
		System.out.println("excecuting test method 2");
		assertEquals(10, 10);// TODO
	}
	
	@After
	public void runAfterTestMethod(){
		System.out.println("After test method");
	}

	@AfterClass
	public static void runAfterTestClass(){
		System.out.println("After test Class");
	}

}
