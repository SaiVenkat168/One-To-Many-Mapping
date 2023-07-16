package com.example.oneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.oneToMany.entity.Library;
import com.example.oneToMany.entity.Student;
import com.example.oneToMany.repository.LibraryRepo;
import com.example.oneToMany.repository.StudentRepo;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner
{
	@Autowired
	StudentRepo lib;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Student s=new Student("Arun");
		
		Student s1=new Student("Lavanya");
		
		Library l1=new Library("Wings of Fire");
		Library l2=new Library("Two States");
		
		Library l3=new Library("Revolution 20 20");
		Library l4=new Library("Last Breathe");
		
		Library l5=new Library("Attack on Titans");
		Library l6=new Library("Marvel comics");
		
		s.getBooks().add(l1);
		s.getBooks().add(l6);
		s.getBooks().add(l3);
		
		
		
		
		s1.getBooks().add(l2);
		s1.getBooks().add(l4);
		s1.getBooks().add(l5);
		
		lib.save(s);
		lib.save(s1);
		
		
		
	}

}
