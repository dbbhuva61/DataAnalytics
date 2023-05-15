package com.devang.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.devang.test.entities.Person;
import com.devang.test.repo.PersonRepository;
import com.devang.test.entities.Person;


@ComponentScan(basePackages = {"com.devang"})
@SpringBootApplication

public class DataAnalysisApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(DataAnalysisApplication.class, args);
		
		PersonRepository personRepository = context.getBean(PersonRepository.class);
		
		Person person = new Person();
		
		person.setPersonId("Person 1");
		person.setFirstName("Devang");
		person.setLastName("Bhuva");
		person.setDob("09/01/2003");
		person.setGender("Male");
		person.setAge(21);
		person.setEmail("devbev61@gmail.com");
		person.setPhonno(1234567890);
		person.setEducation("B.Tech Information Technology");
		person.setOccupation("Java Developer");
		person.setMaritalStatus("No");
		person.setHobby("Drawing");
		person.setStreetAddress("61, Kubernagar simadagam");
		person.setCity("Surat");
		person.setPincode(395006);
		person.setState("Gujarat");
		person.setCountry("India");
		
		Person persondata =personRepository.save(person);
		System.out.println(persondata);
		
	}

}
