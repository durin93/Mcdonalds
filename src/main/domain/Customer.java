package main.domain;

import main.exception.NotExistException;
import main.support.ICustomer;

import java.util.List;

public class Customer implements ICustomer {

    private Cart cart;

    public Customer() {
        this.cart = new Cart();
    }

    public MenuItem chooseMenu(String menuName){
        MenuItem menuItem = Menu.search(menuName).orElseThrow(() -> new NotExistException("존재 하지 않는 메뉴"));
        cart.add(menuItem);
        return menuItem;
    }

    public Foods order(Cashier cashier, Chef chef) {
        return cashier.receiveOrder(cart,chef);
    }

    public Cart getCart() {
        return cart;
    }

}
