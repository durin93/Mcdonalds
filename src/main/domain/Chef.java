package main.domain;

import main.support.IChef;
import main.support.IFood;

public class Chef implements IChef {

    private Foods foods;

    public Chef() {
        this.foods = new Foods();
    }

    public Foods makeFood(Cart cart) {
        for (int i = 0; i < cart.size(); i++) {
            foods.add(makeFood(cart.getMenuItem(i)));
        }
        return foods;
    }

    public IFood makeFood(MenuItem menuItem) {
        return menuItem.foodlization();
    }
}
