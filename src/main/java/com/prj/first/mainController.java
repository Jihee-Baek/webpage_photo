package com.prj.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {

	@GetMapping("test")
	@ResponseBody
	public String test() {
		return "Hola a ver";
	}
}
