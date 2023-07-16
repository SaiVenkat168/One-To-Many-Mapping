package com.example.oneToMany.entity;

import jakarta.persistence.*;
import java.util.*;
@Entity
@Table(name="Students")
public class Student 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	@Column
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="lib_Id")
	private List<Library> books=new ArrayList<>();;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Library> getBooks() {
		return books;
	}

	public void setBooks(List<Library> books) {
		this.books = books;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
	}
	
	

}
