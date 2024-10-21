package com.codeprophet;

import com.codeprophet.model.Book;
import com.codeprophet.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class BookManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookManagementApplication.class, args);
		System.out.println("Hello");

	}

}
