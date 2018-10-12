package test;

import main.domain.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class CustomerTest {

    private Customer customer;

    private Cashier cashier;

    private Chef chef;


    @Before
    public void setUp(){
        customer = new Customer();
        cashier = new Cashier();
        chef = new Chef();
    }

    @Test
    public void chooseMenu(){
        assertTrue(customer.chooseMenu("빅맥").checkMenuItem(MenuItem.BIGMAC));
        assertTrue(customer.chooseMenu("상하이").checkMenuItem(MenuItem.SANGHAI));
    }

    @Test
    public void order(){
        customer.chooseMenu("빅맥");
        Foods foods = customer.order(cashier,chef);
        System.out.println(foods.toString());
        assertThat(foods.contains(new Hambuger("빅맥")),is(true));
    }
}
