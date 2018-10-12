package main.support;

import main.domain.Cart;
import main.domain.Chef;
import main.domain.Foods;
import main.domain.Hambuger;

public interface ICashier {
    Foods receiveOrder(Cart menues, Chef chef);
}
