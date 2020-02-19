package abc.xy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import abc.xy.model.Customer;

@Controller
public class HelloController {
	
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView showHelloPage() {
		System.out.println("I am coming from hello");
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("hello-page");
		mv.addObject("location", "Falls Church");
		
		Customer c = new Customer();
		c.setName("Siddharth");
		c.setEmail("Siddharth@gmail.com");
		
		mv.addObject("loggedInCustomer", c);
		
		return mv;
		
		
		
	}

}
