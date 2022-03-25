package com.example.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomePage {
	@RequestMapping("/home")
	public String home_page() {
		System.out.println("HomePage");
		return "out.jsp";
	}

}
