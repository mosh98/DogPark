package com.example.HundRastGard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**@Author Mosleh Mahamud
 * @Group 73
 * @Course PVT 7.5 */


@SpringBootApplication
public class HundRastGardApplication extends SpringBootServletInitializer {



	public static void main(String[] args) {
		SpringApplication.run(HundRastGardApplication.class, args);
	}

/*	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name",defaultValue = "World") String name){
		return String.format("Hello %s", name);
	}*/

}
