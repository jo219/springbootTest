package com.example.apirecruitment.test.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DatabaseInitializationTest {
    private static final Logger log = LoggerFactory.getLogger(DatabaseInitializationTest.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Initiate " + repository.save(new Employee(
                "Jonathan Musk", "Indonesia",
                    LocalDate.parse("1996-11-25"), 7, 90000000
            )));
        };
    }
}
