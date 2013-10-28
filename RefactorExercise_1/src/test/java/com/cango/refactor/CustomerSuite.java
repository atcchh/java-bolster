package com.cango.refactor;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)  
@Suite.SuiteClasses({    
    Customer_for_rent_children_movie_Test.class,
    Customer_for_rent_many_movie_Test.class,
    Customer_for_rent_new_release_movie_Test.class,
    Customer_for_rent_regular_movie_Test.class,
    Customer_forName_Test.class
    
}) 
public class CustomerSuite {

}
