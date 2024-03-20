package com.prj.first.person;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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