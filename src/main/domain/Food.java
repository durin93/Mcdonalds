package main.domain;

import main.support.IFood;

public class Food implements IFood {
    private String name;
    private int kcal;

    public Food(String menuName, int kcal) {
        this.name = menuName;
        this.kcal = kcal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food hambuger = (Food) o;

        if (kcal != hambuger.kcal) return false;
        return name != null ? name.equals(hambuger.name) : hambuger.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + kcal;
        return result;
    }
}
