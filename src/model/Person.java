package model;

import Exceptions.NoNameException;

import java.util.Objects;

public class Person {

    private String name;
    private String phoneNumber;


    public Person(String name, String phoneNumber) throws Exception {

        if(name.isEmpty())
        {
            throw new Exception("No name introduced.");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "model.Person{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return phoneNumber == person.phoneNumber && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

}
