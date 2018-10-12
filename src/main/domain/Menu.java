package main.domain;

import main.support.IMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Menu implements IMenu {

    private static List<MenuItem> items = makeMenus();

    public static List<MenuItem> makeMenus(){
        List<MenuItem> items = new ArrayList<>();
        items.add(MenuItem.BIGMAC);
        items.add(MenuItem.SANGHAI);
        items.add(MenuItem.COKE);
        return items;
    }

    public static Optional<MenuItem> search(String menuName) {

        for (MenuItem menuItem: items) {
            if(menuItem.isThisName(menuName)){
                return Optional.of(menuItem);
            }
        }
        return Optional.empty();
    }

    public Menu choose(String name) {
        return null;
    }
}
