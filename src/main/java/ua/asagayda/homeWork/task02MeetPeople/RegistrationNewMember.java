package ua.asagayda.homeWork.task02MeetPeople;

import org.jetbrains.annotations.NotNull;

public class RegistrationNewMember {
    private String name;
    private int age;
    private String sex;
    private String city;
    private int countChildren;

    public RegistrationNewMember(String name, int age, String sex, String city, int countChildren) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.city = city;
        this.countChildren = countChildren;
    }

    public RegistrationNewMember(String name, int age, String sex, String city) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.city = city;
    }

    public RegistrationNewMember setAge(int age) {
        if (age<18){
            throw new IllegalArgumentException("When registering on the site, your age must be more than 18 years");
        }
        else {
            this.age = age;
            return this;
        }
    }

    public RegistrationNewMember setName(@NotNull String name) {
        if (name.length()<2){
            throw new IllegalArgumentException("Name must be at least 2 characters");
        }
        else{
            this.name = name;
            return this;
        }
    }

    public RegistrationNewMember setSex(@NotNull String sex) {
        if (!sex.equals("man")|| !sex.equals("woman")){
            throw new IllegalArgumentException("When registering on the site, you can only choose " +
                    "between two parameters: man,  woman");
        }
        else {
            this.sex = sex;
            return this;
        }
    }

    public RegistrationNewMember setCity(@NotNull String city) {
        if(city.length()<2){
            throw new IllegalArgumentException("City name cannot be less than two characters");
        }
        else {
            this.city = city;
            return this;
        }
    }

    public RegistrationNewMember setCountChildren(int countChildren) {
        this.countChildren = countChildren;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getCity() {
        return city;
    }

    public int getCountChildren() {
        return countChildren;
    }
}
