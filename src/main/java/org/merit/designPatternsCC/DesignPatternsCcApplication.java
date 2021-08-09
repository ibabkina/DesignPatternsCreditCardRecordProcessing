package org.merit.designPatternsCC;

import org.merit.designPatternsCC.services.CreditCardService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;

@SpringBootApplication
public class DesignPatternsCcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsCcApplication.class, args);
		CreditCardService.readFromFile("src/test/testData.txt");
	}

}
