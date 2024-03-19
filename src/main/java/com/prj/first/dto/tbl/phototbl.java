package com.prj.first.dto.tbl;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class phototbl {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=500)
	private String imagepath;
	
	@Column(length=500)
	private String desc;

//	@OneToMany(mappedBy = "phototbl", cascade = CascadeType.REMOVE)
//	private List<persontbl> personList;
	
}