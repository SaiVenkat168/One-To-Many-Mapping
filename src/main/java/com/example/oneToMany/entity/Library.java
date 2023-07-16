package com.example.oneToMany.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Library")
public class Library 
{
	
	@Id
	@GeneratedValue
	private int Id;
	
	@Column
	private String book;

	public Library(String book) {
		super();
		this.book = book;
	}

	public Library() {
		super();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}
	
	
	
}
