package com.ssjvirtually.ExcelDemo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcelDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelDemoApplication.class, args);
		
		Excel excel = null;
		
		try {
			excel.createSheet();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
