package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    //@Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student m = new Student("test1",20,"test1mail");
            Student n = new Student("test2",20,"test1mail");
            studentRepository.saveAll(
                    List.of(m,n)
            );
        };
    }
}
