package main.support;


import main.domain.*;

public interface ICustomer {
    MenuItem chooseMenu(String menuName);
    Foods order(Cashier cashier, Chef chef);
}
