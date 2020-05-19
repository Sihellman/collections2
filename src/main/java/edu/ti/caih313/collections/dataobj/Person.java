package edu.ti.caih313.collections.dataobj;



import java.util.Objects;

public class Person {
    private Name name;
    private Gender gender;
    private double age;
    private String emailAddress;

    public enum Gender {MALE, FEMALE}

    public Person(Name name, double age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Gender getGender(){
        return gender;
    }
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
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
                gender == person.gender &&
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
