/**
 * 
 */
package org.sagar.samples.controller.spring;

import static org.junit.Assert.*;
import static org.springframework.test.web.server.result.MockMvcResultHandlers.print;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.server.MockMvc;
import org.springframework.test.web.server.request.MockMvcRequestBuilders;
import org.springframework.test.web.server.result.MockMvcResultHandlers;
import org.springframework.test.web.server.result.MockMvcResultMatchers;
import org.springframework.test.web.server.setup.MockMvcBuilders;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author spras3
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/WEB-INF/spring/appServlet/servlet-context.xml"})
public class MVCHomeControllerTest {
	
	MockMvc mockMvc = null;

	@BeforeClass
	public static void runBeforeTestClass(){
		System.out.println("Before test class");
	}
	
	
	
	@Before
	public void runBeforeTestMethod(){
		System.out.println("Before test method");
		String contextLoc = "classpath:appContext.xml";
		String warDir = "src/main/webapp";

		mockMvc = MockMvcBuilders.xmlConfigSetup("classpath:/WEB-INF/spring/appServlet/servlet-context.xml")
		    .configureWebAppRootDir(warDir, false)
		    .build();
	}

	/**
	 * Test method for {@link org.sagar.samples.controller.spring.HomeController#home()}.
	 * @throws Exception 
	 */
	@Test
	public void testHome() throws Exception {
		System.out.println("excecuting test method 1");
		HomeController homeController = new HomeController();
		ModelAndView mnv = homeController.home();
		assertEquals(mnv.getViewName(), "home");
		assertEquals((String)mnv.getModel().get("name"), "Sagar Prasad");
		
		//------------MVC TESTING------------------//
		mockMvc.perform(MockMvcRequestBuilders.get("/home").accept(MediaType.APPLICATION_XML)).andExpect(MockMvcResultMatchers.status().isOk()).andDo(print());;
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
