package edu.ait.hospitalmanagement.dto;

import java.sql.Date;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private Date dob;
    private int age;
    private String emailId;
    private String password;
    private String country;

    public User() {
    }

    public User(String id, String firstName, String lastName, Date dob, int age, String emailId, String password, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.age = age;
        this.emailId = emailId;
        this.password = password;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
