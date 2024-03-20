package com.prj.first.photo;

import java.util.List;
import java.util.Optional;
import com.prj.first.DataNotFoundException;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class photoService {

	private final phototblRepository photoRepository;
	
	public List<phototbl> getList() {
		return this.photoRepository.findAll();
	}
	
	public phototbl getPhoto(Integer id) {
		Optional<phototbl> photo = this.photoRepository.findById(id);
		if (photo.isPresent()) {
			return photo.get();
		}
		else {
			throw new DataNotFoundException("photo not found");
		}
	}
}
