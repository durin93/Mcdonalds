package main.support;

import main.domain.Cart;
import main.domain.Hambuger;

public interface ICashier {
    Hambuger receiveOrder(Cart menues);
}
