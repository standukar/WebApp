package abc.xy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import abc.xy.model.Customer;

@Controller
public class CustomerController {

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	
	public ModelAndView showCustomer(@RequestParam String id) {
	ModelAndView mv = new ModelAndView();
	mv.setViewName("customer");
	
	Customer c = new Customer();
	c.setId(id);
	c.setEmail("Siddharth@gmail.com");
	c.setName("Siddharth");
	
	mv.addObject("customer", c);
	
	return mv;
	
	}
}
