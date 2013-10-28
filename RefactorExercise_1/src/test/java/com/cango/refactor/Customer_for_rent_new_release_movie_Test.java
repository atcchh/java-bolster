package com.cango.refactor;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Customer_for_rent_new_release_movie_Test {

    @Test
    public void should__get_result_when_customer_not_rent_any_movie() {
        Customer c = new Customer("NewReleaseName");
        assertThat(c.statement(), is("Rental Record for NewReleaseName\nAmount owed is 0.0\nYou earned 0 frequent renter points"));
    }
    
    @Test
    public void should__get_result_when_customer_rent_new_release_movie_1_day() {
        Customer c = new Customer("NewReleaseName");
        Movie m = new Movie("new Release  History", Movie.NEW_RELEASE);
        Rental r = new Rental(m, 1);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for NewReleaseName\n\tnew Release  History\t3.0\nAmount owed is 3.0\nYou earned 1 frequent renter points"));
    }

    @Test
    public void should__get_result_when_customer_rent_new_release_movie_2_day() {
        Customer c = new Customer("NewReleaseName");
        Movie m = new Movie("new Release  History", Movie.NEW_RELEASE);
        Rental r = new Rental(m, 2);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for NewReleaseName\n\tnew Release  History\t6.0\nAmount owed is 6.0\nYou earned 2 frequent renter points"));
    }
    
    @Test
    public void should__get_result_when_customer_rent_new_release_movie_3_day() {
        Customer c = new Customer("NewReleaseName");
        Movie m = new Movie("new Release  History", Movie.NEW_RELEASE);
        Rental r = new Rental(m, 3);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for NewReleaseName\n\tnew Release  History\t9.0\nAmount owed is 9.0\nYou earned 2 frequent renter points"));
    }
    @Test
    public void should__get_result_when_customer_rent_new_release_movie_4_day() {
        Customer c = new Customer("NewReleaseName");
        Movie m = new Movie("new Release  History", Movie.NEW_RELEASE);
        Rental r = new Rental(m, 4);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for NewReleaseName\n\tnew Release  History\t12.0\nAmount owed is 12.0\nYou earned 2 frequent renter points"));
    }
    @Test
    public void should__get_result_when_customer_rent_new_release_movie_100_day() {
        Customer c = new Customer("NewReleaseName");
        Movie m = new Movie("new Release  History", Movie.NEW_RELEASE);
        Rental r = new Rental(m, 100);
        c.addRental(r);
        assertThat(c.statement(), is("Rental Record for NewReleaseName\n\tnew Release  History\t300.0\nAmount owed is 300.0\nYou earned 2 frequent renter points"));
    }

}
