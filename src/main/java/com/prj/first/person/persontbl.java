package com.prj.first.person;
import com.prj.first.tag.tagtbl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class persontbl {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=10)
	private String name;
	
	@Column(length=10)
	private String relation;
	
	private LocalDateTime createDate;
	
	@OneToMany(mappedBy="person")
	private List<tagtbl> tags = new ArrayList();
	
	public Integer getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRelation() {
		return this.relation;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	
}