package com.cango.refactor;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Customer_for_rent_regular_movie_Test {

    @Test
    public void should__get_result_when_customer_not_rent_any_movie() {
        Customer c = new Customer("RegularName");
        assertThat(c.statement(), is("Rental Record for RegularName\nAmount owed is 0.0\nYou earned 0 frequent renter points"));
    }
    
    @Test
    public void should__get_result_when_customer_rent_regular_movie_1_day() {
        Customer c = new Customer("RegularName");
        Movie m = new Movie("Regular  History", Movie.REGULAR);
        Rental r = new Rental(m, 1);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for RegularName\n\tRegular  History\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points"));
    }

    @Test
    public void should__get_result_when_customer_rent_regular_movie_2_day() {
        Customer c = new Customer("RegularName");
        Movie m = new Movie("Regular  History", Movie.REGULAR);
        Rental r = new Rental(m, 2);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for RegularName\n\tRegular  History\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points"));
    }
    
    @Test
    public void should__get_result_when_customer_rent_regular_movie_3_day() {
        Customer c = new Customer("RegularName");
        Movie m = new Movie("Regular  History", Movie.REGULAR);
        Rental r = new Rental(m, 3);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for RegularName\n\tRegular  History\t3.5\nAmount owed is 3.5\nYou earned 1 frequent renter points"));
    }
    @Test
    public void should__get_result_when_customer_rent_regular_movie_4_day() {
        Customer c = new Customer("RegularName");
        Movie m = new Movie("Regular  History", Movie.REGULAR);
        Rental r = new Rental(m, 4);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for RegularName\n\tRegular  History\t5.0\nAmount owed is 5.0\nYou earned 1 frequent renter points"));
    }
    @Test
    public void should__get_result_when_customer_rent_regular_movie_100_day() {
        Customer c = new Customer("RegularName");
        Movie m = new Movie("Regular  History", Movie.REGULAR);
        Rental r = new Rental(m, 100);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for RegularName\n\tRegular  History\t149.0\nAmount owed is 149.0\nYou earned 1 frequent renter points"));
    }

}
