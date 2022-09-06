package com.example.demo.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="test2")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private Integer age;
    @Column(name="email")
    private String email;

    public Student(String name, Integer age,String email){
        this.name=name;
        this.email=email;
        this.age=age;

    }

}
