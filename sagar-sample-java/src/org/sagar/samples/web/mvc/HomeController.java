package org.sagar.samples.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author spras3
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView home() {
		try {
			System.out.println("INSIDE HOME CONTROLLER--");
			ModelAndView model = new ModelAndView("home");
			model.addObject("name", "Sagar Prasads");
			return model;
		} catch (Exception e) {
			System.out.println("Exception" +e.getMessage());
		}
		return null;
	}
	
}