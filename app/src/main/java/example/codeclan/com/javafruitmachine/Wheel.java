package example.codeclan.com.javafruitmachine;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 31/01/2018.
 */

public class Wheel {

    private String position;
    private ArrayList<Fruit> fruits;



    public Wheel(String position, ArrayList<Fruit> fruits) {
        this.position = position;
        this.fruits = fruits;
    }


    public String getPosition() {
        return position;
    }

    public Fruit getFruit() {
        return this.fruits.get(0);
    }

    public int getCount() {
        return this.fruits.size();
    }

    public Fruit getRandomFruit() {
        Collections.shuffle(fruits);
        return this.fruits.get(0);
    }

    public int getFruitIndex(Fruit fruit) {
        return fruits.lastIndexOf(fruit);
    }

}
