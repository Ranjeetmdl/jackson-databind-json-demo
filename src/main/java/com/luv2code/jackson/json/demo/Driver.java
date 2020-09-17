package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			//create the object mapper object
			ObjectMapper mapper = new ObjectMapper();
			
			//read the JSON file from data/sample-full.json and map/convert it to
			//Student Object
			Student theStudent = mapper.readValue(
					             new File("data/sample-full.json"), Student.class);
			
			//display the firstName & lastName of the student
			System.out.println("first Name :"+theStudent.getFirstName());
			System.out.println("last Name :"+theStudent.getLastName());
			
			//print the address : street & city
			Address tempAddress = theStudent.getAddress();
			System.out.println("Stree :"+tempAddress.getStreet());
			System.out.println("City :"+tempAddress.getCity());
			
			//print the languages 
			for(String tempLanguage : theStudent.getLanguages())
				System.out.println(tempLanguage);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
