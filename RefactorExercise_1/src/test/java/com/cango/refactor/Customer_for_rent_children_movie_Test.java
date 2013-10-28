package com.cango.refactor;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Customer_for_rent_children_movie_Test {

    @Test
    public void should__get_result_when_customer_not_rent_any_movie() {
        Customer c = new Customer("Cango");
        assertThat(c.statement(), is("Rental Record for Cango\nAmount owed is 0.0\nYou earned 0 frequent renter points"));
    }
    
    @Test
    public void should__get_result_when_customer_rent_childrens_movie_1_day() {
        Customer c = new Customer("Cango");
        Movie m = new Movie("History", Movie.CHILDRENS);
        Rental r = new Rental(m, 1);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for Cango\n\tHistory\t1.5\nAmount owed is 1.5\nYou earned 1 frequent renter points"));
    }

    @Test
    public void should__get_result_when_customer_rent_childrens_movie_2_day() {
        Customer c = new Customer("Cango");
        Movie m = new Movie("History", Movie.CHILDRENS);
        Rental r = new Rental(m, 2);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for Cango\n\tHistory\t1.5\nAmount owed is 1.5\nYou earned 1 frequent renter points"));
    }
    
    @Test
    public void should__get_result_when_customer_rent_childrens_movie_3_day() {
        Customer c = new Customer("Cango");
        Movie m = new Movie("History", Movie.CHILDRENS);
        Rental r = new Rental(m, 3);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for Cango\n\tHistory\t1.5\nAmount owed is 1.5\nYou earned 1 frequent renter points"));
    }
    @Test
    public void should__get_result_when_customer_rent_childrens_movie_4_day() {
        Customer c = new Customer("Cango");
        Movie m = new Movie("History", Movie.CHILDRENS);
        Rental r = new Rental(m, 4);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for Cango\n\tHistory\t3.0\nAmount owed is 3.0\nYou earned 1 frequent renter points"));
    }
    @Test
    public void should__get_result_when_customer_rent_childrens_movie_100_day() {
        Customer c = new Customer("Cango");
        Movie m = new Movie("History", Movie.CHILDRENS);
        Rental r = new Rental(m, 100);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for Cango\n\tHistory\t147.0\nAmount owed is 147.0\nYou earned 1 frequent renter points"));
    }

}
