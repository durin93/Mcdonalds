package main.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cart {
    private List<MenuItem> menues = new ArrayList<>();

    public void add(Optional<MenuItem> menuItem) {
        menues.add(menuItem.get());
    }

    public boolean checkMenuItem(MenuItem menuItem){
        return menues.contains(menuItem);
    }

    public int size() {
        return menues.size();
    }
    public String getMenuName(int i) {
        return menues.get(i).getName();
    }
}
