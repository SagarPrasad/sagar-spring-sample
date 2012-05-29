/**
 * 
 */
package org.sagar.samples.restservice.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sagar.samples.domain.UserObj;
import org.sagar.samples.domain.UserXML;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author spras3
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/WEB-INF/spring/appServlet/servlet-context.xml"})
public class RestServiceControllerTest {

	/**
	 * Test method for {@link org.sagar.samples.restservice.spring.RestServiceController#getFixUser()}.
	 */
	@Test
	public void testGetFixUser() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.sagar.samples.restservice.spring.RestServiceController#getUser(java.lang.String)}.
	 */
	@Test
	public void testGetUser() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.sagar.samples.restservice.spring.RestServiceController#readParamValues(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testReadParamValues() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.sagar.samples.restservice.spring.RestServiceController#readFormValues(org.sagar.samples.domain.UserObj)}.
	 */
	@Test
	public void testReadFormValues() {
		UserObj userForm  = new UserObj();
		userForm.setDescription("description");
		userForm.setName("Sagar Prasad");
		RestServiceController restServiceController = new RestServiceController();
		UserXML user = restServiceController.readFormValues(userForm);
		assertEquals(user.getName(), userForm.getName());
		
	}

	/**
	 * Test method for {@link org.sagar.samples.restservice.spring.RestServiceController#takeXMLReturnXML(org.sagar.samples.domain.UserXML)}.
	 */
	@Test
	public void testTakeXMLReturnXML() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.sagar.samples.restservice.spring.RestServiceController#takeJSONReturnJSON(org.sagar.samples.domain.UserObj)}.
	 */
	@Test
	public void testTakeJSONReturnJSON() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.sagar.samples.restservice.spring.RestServiceController#consumeJSONReturnJSON(org.sagar.samples.domain.UserObj)}.
	 */
	@Test
	public void testConsumeJSONReturnJSON() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.sagar.samples.restservice.spring.RestServiceController#produceJSONReturnJSON(org.sagar.samples.domain.UserObj)}.
	 */
	@Test
	public void testProduceJSONReturnJSON() {
		fail("Not yet implemented"); // TODO
	}

}
