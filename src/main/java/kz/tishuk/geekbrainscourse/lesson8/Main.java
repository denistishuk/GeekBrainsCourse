package kz.tishuk.geekbrainscourse.lesson8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    static class Person{
        private String name;
        private int age;
        private int salary;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getSalary() {
            return salary;
        }

        public Person(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        String[] arrayStr = {"Denis", "Yulya", "Anton", "Denis", "Dengddh", "Den", "Den"};
        String result = Arrays.stream(arrayStr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .get().getKey();
        System.out.println("Максимально повторяющаяся строка " + result);

        Person[] persons = {new Person("Denis", 33, 3000), new Person("Anton", 35, 10_000), new Person("Kuanish", 22, 1000)};
        Double averageSalary = Arrays.stream(persons).collect(Collectors.averagingDouble(Person::getSalary));
        System.out.println(averageSalary);

        final int LIMIT = 2;
        Arrays.stream(persons).
                sorted(((o1, o2) -> o2.age - o1.age))
                .limit(LIMIT)
                .map(Person::getName)
                .forEach(System.out:: println);
    }
}
