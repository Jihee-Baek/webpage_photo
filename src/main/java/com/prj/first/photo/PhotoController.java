package com.prj.first.photo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;

@RequestMapping("/photo")
@RequiredArgsConstructor
@Controller
public class photoController {

	private final photoService photoServ;
	
	@GetMapping("/list")
	public String photoList(Model model) {
		
		List<phototbl> photoList = this.photoServ.getList();
		model.addAttribute("photoList", photoList);
		
		return "photo_list";
	}
	
	@GetMapping("/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		phototbl photo = this.photoServ.getPhoto(id);
		model.addAttribute("photo", photo);
		return "photo_detail";
	}
}
