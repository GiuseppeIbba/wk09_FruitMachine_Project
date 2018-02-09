package example.codeclan.com.javafruitmachine;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 31/01/2018.
 */

public class Wheel {

    private String position;
    private ArrayList<Fruit> fruits;
    private Boolean hold;


    public Wheel(String position, ArrayList<Fruit> fruits) {
        this.position = position;
        this.fruits = fruits;
        this.hold = false;

    }


    public String getPosition() {
        return position;
    }

    public boolean Holder() {
        return this.hold;
    }

    public void setHolder() {
        this.hold = true;
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

//    public Fruit getNextFruit(int size, int randomId) {
//        if (randomId == size - 1) {
//            int nudgeId = 0;
//            return this.fruits.get(nudgeId);
//        } else {
//            return this.fruits.get(randomId + 1);
//        }
    }


