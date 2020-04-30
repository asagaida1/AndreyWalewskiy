package ua.asagayda.homework.task02_meet_people;

public class Member {
    Gender gender;

    private String name;
    private int age;
    private String city;
    private int countChildren;

    public Member(Gender gender, String name, int age, String city, int countChildren) {
        this.gender = gender;
        this.setName(name);
        this.setAge(age);
        this.setCity(city);
        this.setCountChildren(countChildren);
    }

    public Member setAge(int age) {
        if (age > 18) {
            this.age = age;
            return this;
        }

        throw new IllegalArgumentException("When registering on the site, your age must be more than 18 years");

    }

    public Member setName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException("Name must be at least 2 characters");
        } else {
            this.name = name;
            return this;
        }
    }

    public Member setCity(String city) {
        if (city.length() < 2) {
            throw new IllegalArgumentException("City name cannot be less than two characters");
        } else {
            this.city = city;
            return this;
        }
    }

    public Member setCountChildren(int countChildren) {
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
    public String toString() {
        return "Member{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", countChildren=" + countChildren +
                '}';
    }
}


