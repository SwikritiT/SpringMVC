package com.swikriti.springMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping(value="/create",method = RequestMethod.GET)
	public String create() {
		return "student/create";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String store(HttpServletRequest req, Model model) {
		String name = req.getParameter("name").toLowerCase();
		model.addAttribute("message", name);
		return "student/displayName";
		
	}

}
