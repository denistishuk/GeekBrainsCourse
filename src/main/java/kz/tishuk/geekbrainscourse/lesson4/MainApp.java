package kz.tishuk.geekbrainscourse.lesson4;

import kz.tishuk.geekbrainscourse.lesson4.fruit.Apple;
import kz.tishuk.geekbrainscourse.lesson4.fruit.Fruit;
import kz.tishuk.geekbrainscourse.lesson4.fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Apple> apple = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            apple.add(new Apple());
        }
        List<Orange> orange = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            orange.add(new Orange());
        }
        Box<Apple> appleBox = new Box<>(apple);
        Box<Orange> orangeBox = new Box<>(orange);
        Box<Fruit> fruitBox = new Box<>();
        System.out.println("Вес коробки = " + fruitBox.getWeight());
        appleBox.transfer(fruitBox);
        System.out.println("Вес коробки = " + fruitBox.getWeight());
        System.out.println("Вес коробки = " + appleBox.getWeight());

    }

    //Первое задание. Поменять два элемента массива местами
     public static void swap (Object[] arr, int n1, int n2) {
        Object temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    // Второе задание. Преобразование массива в ArrayList
    <T> ArrayList<T> convertToList (T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }


}
