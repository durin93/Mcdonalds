package main.domain;

import main.support.IFood;

import java.util.ArrayList;
import java.util.List;

public class Foods {
    private List<IFood> foods = new ArrayList<>();

    public void add(IFood food) {
        foods.add(food);
    }

    public boolean contains(IFood food){
        return foods.contains(food);
    }

    @Override
    public String toString() {
        return "Foods{" +
                "foods=" + foods +
                '}';
    }
}
