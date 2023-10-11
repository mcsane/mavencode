package task8_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;



public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    @Override
    public String toString() {
        return name + " " + age + " " + city;
    }



    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 20, "London"));
        people.add(new Person("Steve", 30, "Paris"));
        people.add(new Person("Mary", 25, "Madrid"));
        people.add(new Person("Anna", 27, "Paris"));
        people.add(new Person("Mike", 21, "Paris"));
        people.add(new Person("Bob", 31, "Paris"));

        Collections.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        String city = "Paris";
        people.forEach(person -> {
            if (person.getCity().equals(city)) {
                System.out.println(person);
            }
        });
    }


}
