package com.cango.refactor;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Customer_forName_Test {

    @Test
    public void should_test_user_name_when_create_customer() {
        Customer c = new Customer("Cango");
        assertThat(c.getName(), is("Cango"));
        c = new Customer("Cango1");
        assertThat(c.getName(), is("Cango1"));
    }

}
