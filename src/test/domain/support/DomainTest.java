package test.domain.support;

import main.domain.Cashier;
import main.domain.Chef;
import main.domain.Customer;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class DomainTest {

    @Rule
    protected ExpectedException thrown = ExpectedException.none();

    protected Customer customer = new Customer();

    protected Cashier cashier = new Cashier();

    protected Chef chef = new Chef();

}
