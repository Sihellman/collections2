package edu.ti.caih313.collections.dataobj;

import java.util.Objects;

public class Person {
    private Name name;
    private String gender;
    private double age;
    private String emailAddress;

    public enum Gender {MALE("male"), FEMALE("female");
        String gender;
        Gender(String gender) {
            this.gender = gender;
        }
    }

    public Person(Name name, String gender, double age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                gender.equals(person.gender) &&
                age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", gender=" + gender +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
