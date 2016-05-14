package org.sraka.webby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootWebby {

	public static void main(String[] args) {
		SpringApplication.run(BootWebby.class, args);
	}
}
