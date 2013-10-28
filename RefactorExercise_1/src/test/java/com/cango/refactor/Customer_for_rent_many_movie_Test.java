package com.cango.refactor;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Customer_for_rent_many_movie_Test {

    
    @Test
    public void should__get_result_when_customer_rent_all_type_movie() {
        Customer c = new Customer("Cango");
        Movie m = new Movie("History", Movie.CHILDRENS);
        Rental r = new Rental(m, 1);
        c.addRental(r);
        c.addRental(new Rental(new Movie("new release history", Movie.NEW_RELEASE), 2));
        c.addRental(new Rental(new Movie("new release history", Movie.REGULAR), 3));
        assertThat(c.statement(), is("Rental Record for Cango\n\tHistory\t1.5\n\tnew release history\t6.0\n\tnew release history\t3.5\nAmount owed is 11.0\nYou earned 4 frequent renter points"));
    }
}
