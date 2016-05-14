package org.sraka.contentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.sraka.contentservice.controller.PanelController;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {PanelController.class})
public class BootContent {

	public static void main(String[] args) {
		SpringApplication.run(BootContent.class, args);
	}
}
