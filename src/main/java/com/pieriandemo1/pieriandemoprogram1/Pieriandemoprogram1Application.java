package com.pieriandemo1.pieriandemoprogram1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication
public class Pieriandemoprogram1Application {

//	@RequestMapping(value="/getdata")
//	public String getData(){
//		return "Hello Spring";
//	}

	public static void main(String[] args) {
		System.out.println("Hello Spring");
		SpringApplication.run(Pieriandemoprogram1Application.class, args);
	}

}
