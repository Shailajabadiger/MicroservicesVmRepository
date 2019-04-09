package com.mindtree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/welcomepage")
	public String Welcome()
	{
		return "welcomepage";
	}

}
