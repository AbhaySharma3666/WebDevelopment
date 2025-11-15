package com.springSTS;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(Application.class, args);
		StudentRepo bean = run.getBean(StudentRepo.class);
		
//		Student st1 = new Student();
//		st1.setName("Verma");
//		st1.setCity("Goa");
//		
//		Student st2 = new Student();
//		st2.setName("Ravi");
//		st2.setCity("Lacknow");
//		
//		Student st3 = new Student();
//		st3.setName("Rahul");
//		st3.setCity("UP");
//		
//		Student st4 = new Student();
//		st4.setName("Golu");
//		st4.setCity("Durg");
		
		/* for single data save
//		Student save = bean.save(st1); 
//		System.out.println(st1) */
		/*
		List<Student> alldata = List.of(st1, st2, st3, st4);
		Iterable<Student> saveAll = bean.saveAll(alldata);
		
		saveAll.forEach(s1->{
			System.out.println(s1);
		});
		*/
		
		// delete data
//		bean.deleteById(5);
//		System.out.println("One data is deleted");
		
		
		// delete all
		Iterable<Student> findall = bean.findAll();
		bean.deleteAll(findall);
		System.out.println("One data is deleted all");
	}

}
