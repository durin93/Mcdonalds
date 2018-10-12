package main.support;


import main.domain.Cart;

public interface ICustomer {
    Cart chooseMenu(String menuName);
    void order(Cart menues);
}
