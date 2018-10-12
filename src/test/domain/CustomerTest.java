package test.domain;

import main.domain.Food;
import main.domain.Foods;
import main.domain.MenuItem;
import main.exception.NotExistException;
import org.junit.Test;
import test.domain.support.DomainTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;


public class CustomerTest extends DomainTest {

    @Test
    public void chooseMenu() {
        assertThat(customer.chooseMenu("빅맥"), is(MenuItem.BIGMAC));
        assertThat(customer.chooseMenu("상하이"), is(MenuItem.SANGHAI));
    }

    @Test
    public void chooseMenu_notExistMenu() {
        thrown.expect(NotExistException.class);
        thrown.expectMessage("존재 하지 않는 메뉴");
        customer.chooseMenu("싸이버거");
        fail();
    }

    @Test
    public void order() {
        customer.chooseMenu("빅맥");
        Foods foods = customer.order(cashier, chef);
        assertThat(foods.contains(new Food("빅맥")), is(true));
        assertThat(foods.contains(new Food("콜라")), is(false));
    }
}
