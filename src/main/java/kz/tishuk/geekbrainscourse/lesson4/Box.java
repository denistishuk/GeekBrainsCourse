package kz.tishuk.geekbrainscourse.lesson4;

import kz.tishuk.geekbrainscourse.lesson4.fruit.Fruit;

import java.util.*;

public class Box<T extends Fruit> {
    //private float weight;
    Collection<T> fruits;

    public Box(Collection<T> fruits) {
        this.fruits = new ArrayList<>(fruits);
    }

    public Box(T... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public float getWeight() {
        float sum = 0;
        for (T element : this.fruits) {
            sum += element.getWeight();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits +
                '}';
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

/*    public void add(T[] fruits){
        this.fruits.addAll(Arrays.asList(fruits));
    }*/
    @SafeVarargs
    public final void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }
    public void add(Collection<T> fruits){
        this.fruits.addAll(fruits);
    }


    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void transfer(Box<? super T> another) {
        if(this == another) {
            return;
        }
        another.fruits.addAll(this.fruits);
        this.fruits.clear();
    }


}
