package com.demonstration.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Books extends Audit {
	@NotBlank
	@Column(length = 30,unique = true)
	private String title;
	@NotBlank
	private String author;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Books(@NotBlank String title, @NotBlank String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
