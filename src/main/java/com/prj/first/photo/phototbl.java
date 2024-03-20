package com.prj.first.photo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.prj.first.tag.tagtbl;

import jakarta.persistence.*;
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
	
	@Column(length=50)
	private String title;
	
	@Column(length=500)
	private String desc;
	
	private LocalDateTime createDate;
	
	@OneToMany(mappedBy="photo")
	private List<tagtbl> tags = new ArrayList();

	public Integer getId() {
		return this.id;
	}
	
	public String getImagepath() {
		return this.imagepath;
	}
	
	public String getTitle() {
		return this.title;
	}

	public String getDesc() {
		return this.desc;
	}
	
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
}