package 交大慧谷.day11.j05超市系统;

import java.util.ArrayList;
import java.util.Iterator;

public class Supermarket {
    private String name;
    private ArrayList<Fruit> fruits = new ArrayList<>();

    public Supermarket(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    public void add(Fruit fruit){
        fruits.add(fruit);
    }

    public void remove(Fruit fruit){
        fruits.remove(fruit);
    }

    public ArrayList<String> search(String keyword){
        ArrayList<String> list = new ArrayList<String>();
        Iterator<Fruit> it = fruits.iterator();
        while(it.hasNext()){
            Fruit fruit = it.next();
            if(fruit.getName().indexOf(keyword)!=-1){
                list.add(fruit.getName());
            }
        }
        return list;
    }
}
