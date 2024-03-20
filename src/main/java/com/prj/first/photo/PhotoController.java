package com.prj.first.photo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PhotoController {

	@GetMapping("/photo/list")
	@ResponseBody
	public String photoList() {
		return "question list";
	}
}
