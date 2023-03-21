package com.company;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(address);
    }

    public boolean hasAge() {
        return (this.age < 0) ? false : true;
    }

    public boolean hasAddress() {
        return (getAddress() == null) ? false : true;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(this.age);
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) this.age++;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + "\n" +
                "Фамилия: " + this.surname + "\n" +
                "Возраст: " + this.age + "\n" +
                "Адрес: " + this.address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }


}

