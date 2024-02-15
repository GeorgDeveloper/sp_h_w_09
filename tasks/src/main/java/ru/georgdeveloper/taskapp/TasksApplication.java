package ru.georgdeveloper.userapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Egor
 * Программа по постановке задач пользователям
 */

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"ru.georgdeveloper.userapp.services"})
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

}
