/**
 * 
 */
package org.sagar.samples.restservice.spring;

import org.sagar.samples.domain.UserObj;
import org.sagar.samples.domain.UserXML;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author spras3
 *
 */
@Controller
//@RequestMapping("/spring/rest")
public class RestServiceController {

	/**
	 * 
	 * @return JSON Object
	 */
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public  @ResponseBody UserObj getFixUser() {
		UserObj userObj = new UserObj();
		userObj.setName("Sagar Prasad");
		userObj.setDescription("Some Description");
		return userObj;
	}
	
	/**
	 * 
	 * @param userId as path variable
	 * @return XML String as the response object is XMLElement Annotated
	 */
	@RequestMapping("/user/{userId}")
	public @ResponseBody UserXML getUser(@PathVariable String userId) {
		UserXML user = new UserXML();
		user.setName("Sagar Prasad" + userId);
		user.setDescription("Some Description");
		return user;
	}
	
	@RequestMapping("/user/param")
	public @ResponseBody UserXML readParamValues(@RequestParam String name, @RequestParam String description){
		UserXML user = new UserXML();
		user.setName(name);
		user.setDescription(description);
		return user;
	}
	
	@RequestMapping("/user/form")
	public @ResponseBody UserXML readFormValues(UserObj userForm){
		System.out.println("Got the userForm");
		UserXML user = new UserXML();
		user.setName(userForm.getName());
		user.setDescription(userForm.getDescription());
		return user;
	}
	
	@RequestMapping(value = "/user/xml", method = RequestMethod.POST)
	public @ResponseBody UserXML takeXMLReturnXML(@RequestBody UserXML userXML){
		System.out.println("Got the userXML");
		UserXML user = new UserXML();
		user.setName(userXML.getName());
		user.setDescription(userXML.getDescription());
		return user;
	}
	
	@RequestMapping(value = "/user/json", method = RequestMethod.POST)
	public @ResponseBody UserObj takeJSONReturnJSON(@RequestBody UserObj userJSON){
		System.out.println("Received in JSON");
		UserObj user = new UserObj();
		user.setDescription(userJSON.getDescription());
		user.setName(userJSON.getName());
		return user;
	}
	
	@RequestMapping(value = "/user/json/consume", method = RequestMethod.POST, consumes="application/json")
	public @ResponseBody UserObj consumeJSONReturnJSON(@RequestBody UserObj userJSON){
		System.out.println("Received in JSON");
		UserObj user = new UserObj();
		user.setDescription(userJSON.getDescription());
		user.setName(userJSON.getName());
		return user;
	}
	
	@RequestMapping(value = "/user/json/consume", method = RequestMethod.POST, produces="application/json")
	@ResponseBody
	public UserObj produceJSONReturnJSON(@RequestBody UserObj userJSON){
		System.out.println("Received in JSON");
		UserObj user = new UserObj();
		user.setDescription(userJSON.getDescription());
		user.setName(userJSON.getName());
		return user;
	}
	
	
	/*public @ResponseBody String returnHttpErrorCodeOnParam(){
		return null;
	}
	
	*/
}
