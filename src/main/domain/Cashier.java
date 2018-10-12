package main.domain;

import main.support.ICashier;

public class Cashier implements ICashier {

    public Foods receiveOrder(Cart cart, Chef chef) {
        return chef.makeFood(cart);
    }


}
