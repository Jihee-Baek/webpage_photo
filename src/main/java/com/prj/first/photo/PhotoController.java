package com.prj.first.photo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class photoController {

	private final phototblRepository photoRepository;
	
	@GetMapping("/photo/list")
	public String photoList(Model model) {
		
		List<phototbl> photoList = this.photoRepository.findAll();
		model.addAttribute("photoList", photoList);
		
		return "photo_list";
	}
}
