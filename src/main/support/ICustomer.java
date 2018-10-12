package main.support;


import main.domain.Cart;
import main.domain.Cashier;
import main.domain.Chef;
import main.domain.Foods;

public interface ICustomer {
    Cart chooseMenu(String menuName);
    Foods order(Cashier cashier, Chef chef);
}
