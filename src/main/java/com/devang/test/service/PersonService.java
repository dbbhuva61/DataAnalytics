package com.devang.test.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.BranchElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devang.test.entities.Person;
import com.devang.test.repo.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repo;
	
	String line="";
	public void setPerson() {
		try {
			BufferedReader b1 = new BufferedReader(new FileReader("src/main/resources/lol.csv"));
			int i = 2;
			String ps;
			while((line=b1.readLine())!=null) {
				String[] data = line.split(",");
//				List<Person> personList = new ArrayList<>();

				try {
				Person person = new Person();
				
				ps = "Person "+i;
				i++;
				
				person.setPersonId(ps);
				person.setFirstName(data[0]);
				person.setLastName(data[1]);
				person.setDob(data[2]);
				person.setGender(data[3]);
				person.setAge(Integer.valueOf(data[4]));
				person.setEmail(data[5]);
				person.setPhonno(Integer.valueOf(data[6]));
				person.setEducation(data[7]);
				person.setOccupation(data[8]);
				person.setMaritalStatus(data[9]);
				person.setHobby(data[10]);
				person.setStreetAddress(data[11]);
				person.setCity(data[12]);
				person.setPincode(Integer.valueOf(data[13]));
				person.setState(data[14]);
				person.setCountry(data[15]);
				
				repo.save(person);
				}catch (Exception e) {
					System.out.println(line);				}
 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
