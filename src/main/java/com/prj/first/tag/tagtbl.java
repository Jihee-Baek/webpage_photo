package com.prj.first.tag;

import com.prj.first.person.persontbl;
import com.prj.first.photo.phototbl;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class tagtbl {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="person_id")
	private persontbl person;
	
	@ManyToOne
	@JoinColumn(name="photo_id")
	private phototbl photo;
}
