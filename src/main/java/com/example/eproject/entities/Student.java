package com.example.eproject.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Size(min=2, max=30)
    private String firstName;
    @Size(min=2, max=30)
    private String secondName;
    @Size(min=2, max=30)
    private String lastName;
    @Past
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date birthDay;
    @Email
    private String email;
    @Size(min=3, max=15)
    private String phoneNumber;
    @Size(min=2, max=300)
    private String description;
    //photo
    @Size(min=2, max=30)
    private String town;
    //private int age = setAge();

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //public int setAge(){
    //    return (LocalDate.now().getYear()-this.birthDay.getYear());
    //}

    //public int getAge() {
    //    return age;
    //}

}
