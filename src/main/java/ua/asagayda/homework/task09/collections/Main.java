package ua.asagayda.homework.task09.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap();

        Collection c = new ArrayList<String>();
        List list = new ArrayList();
        list.add("2");

 /*       System.out.println(list.size());
        System.out.println(list.hashCode());
        System.out.println(list.toArray());*/

        List<Person> people = Arrays.asList(
                new Person(3, 20, "John"),
                new Person(1, 30, "Jack"),
                new Person(2, 40, "Steeve")
        );

        Comparator<Person> comparatorAge = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());
        Comparator<Person> comparatorName = (p1, p2) -> Integer.compare(p1.getName().length(), p2.getName().length());

        Collections.sort(people, comparatorAge.thenComparing(comparatorName));

        System.out.println(people);
    }
}

/*
* Person(id, name, age)
* */

class Person implements Comparable<Person>{
    private int id;
    private int age;
    private String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(o.id, this.id);
//        return Integer.compare(this.name.length(), o.name.length());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
