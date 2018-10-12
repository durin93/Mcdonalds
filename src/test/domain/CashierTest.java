package test.domain;

import main.domain.Food;
import main.domain.Foods;
import main.domain.MenuItem;
import org.junit.Before;
import org.junit.Test;
import test.domain.support.DomainTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CashierTest extends DomainTest {

    @Before
    public void setUp(){
        customer.chooseMenu("빅맥");
        customer.chooseMenu("콜라");
    }

    @Test
    public void receiveOrder(){
        Foods foods = cashier.receiveOrder(customer.getCart(),chef);
        assertThat(foods.contains(MenuItem.BIGMAC.foodlization()),is(true));
        assertThat(foods.contains(MenuItem.COKE.foodlization()),is(false));
    }

}
