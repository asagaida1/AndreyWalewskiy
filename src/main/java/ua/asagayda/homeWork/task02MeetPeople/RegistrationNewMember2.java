package ua.asagayda.homeWork.task02MeetPeople;

import java.util.Objects;

public class RegistrationNewMember2 {
    Gender gender;

    private String name;
    private int age;
    private String city;
    private int countChildren;

    public RegistrationNewMember2(Gender gender, String name, int age, String city, int countChildren) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.city = city;
        this.countChildren = countChildren;
    }

    public RegistrationNewMember2() {

    }

    public RegistrationNewMember2 setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("When registering on the site, your age must be more than 18 years");
        } else {
            this.age = age;
            return this;
        }
    }

    public RegistrationNewMember2 setName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException("Name must be at least 2 characters");
        } else {
            this.name = name;
            return this;
        }
    }

    public RegistrationNewMember2 setCity(String city) {
        if (city.length() < 2) {
            throw new IllegalArgumentException("City name cannot be less than two characters");
        } else {
            this.city = city;
            return this;
        }
    }

    public RegistrationNewMember2 setCountChildren(int countChildren) {
        this.countChildren = countChildren;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public int getCountChildren() {
        return countChildren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationNewMember2 that = (RegistrationNewMember2) o;
        return age == that.age &&
                countChildren == that.countChildren &&
                gender == that.gender &&
                name.equals(that.name) &&
                city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, age, city, countChildren);
    }

    @Override
    public String toString() {
        return "RegistrationNewMember2{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", countChildren=" + countChildren +
                '}';
    }
}


