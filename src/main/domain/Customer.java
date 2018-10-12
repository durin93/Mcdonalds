package main.domain;

import main.support.ICustomer;

public class Customer implements ICustomer {

    private Cart cart;

    public Customer() {
        this.cart = new Cart();
    }

    public Cart chooseMenu(String menuName) {
        cart.add(Menu.search(menuName));
        return cart;
    }

    public Foods order(Cashier cashier, Chef chef) {
        return cashier.receiveOrder(cart,chef);
    }

}
