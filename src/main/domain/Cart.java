package main.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Cart {
    private List<MenuItem> menues = new ArrayList<>();

    public void add(MenuItem menuItem) {
        menues.add(menuItem);
    }

    public boolean checkMenuItem(MenuItem menuItem){
        return menues.contains(menuItem);
    }

    public int size() {
        return menues.size();
    }
    public MenuItem getMenuItem(int i) {
        return menues.get(i);
    }
}
