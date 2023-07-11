package Homeworks.Homework4;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends  Fruit>{
    public List<T> fruits;

    public Box(){
        this.fruits = new ArrayList<>();
    }

    public void add (T fruit){
        fruits.add(fruit);
    }

    public int getWeight(){
        int totalWeight = 0;
        for (T fruit: fruits){
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void moveTo(Box<T> anotherBox){
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
