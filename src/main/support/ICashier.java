package main.support;

import main.domain.Cart;
import main.domain.Chef;
import main.domain.Foods;

public interface ICashier {
    Foods receiveOrder(Cart menues, Chef chef);
}
