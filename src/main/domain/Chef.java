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
            foods.add(makeFood(cart.getMenuName(i)));
        }
        return foods;
    }

    public IFood makeFood(String menuName) {
        if(menuName.equals("빅맥")){
            return new Hambuger(menuName);
        }
        return null;
    }
}
