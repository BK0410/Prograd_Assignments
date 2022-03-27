package com.hungry.HungryProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HungryController {
	
	@Autowired
	private UserRepo repo;
	
	@GetMapping("")
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/register")
	public String signUpPage(Model model) {
		model.addAttribute("user",new User());
		return "signUpPage";
	}
	
	@PostMapping("/registered")	
	public String appendTable(User user) {
		repo.save(user);
		return "registeredPage";
		
	}

}
