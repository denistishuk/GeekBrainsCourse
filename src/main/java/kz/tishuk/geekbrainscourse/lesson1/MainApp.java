package kz.tishuk.geekbrainscourse.lesson1;

import kz.tishuk.geekbrainscourse.lesson1.Animal.Animal;
import kz.tishuk.geekbrainscourse.lesson1.Animal.Cat;
import kz.tishuk.geekbrainscourse.lesson1.Animal.Dog;
import kz.tishuk.geekbrainscourse.lesson1.Animal.Tiger;

public class MainApp {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Бобик"),
                new Cat("Тишка"),
                new Tiger("Leo", 500, 500),
                new Dog("Шарик"),

        };

        for (Animal animal : animals) {
            animal.run(250);
            animal.swim(150);
        }

        System.out.println("Количество собак " + Dog.count);
        System.out.println("Количество котов " + Cat.count);
        System.out.println("Количество тигров " + Tiger.count);

    }
}
