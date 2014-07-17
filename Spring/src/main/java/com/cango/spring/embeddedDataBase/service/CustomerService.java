package com.cango.spring.embeddedDataBase.service;

import com.cango.spring.embeddedDataBase.dao.CustomerDAO;
import com.cango.spring.embeddedDataBase.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by caoyanfei079 on 7/16/14.
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerDAO customerDAO;
    public void createNewCustomer(String name, Integer age) {
        CustomerDTO customer = new CustomerDTO();
        customer.setAge(age);
        customer.setId(12l);
        customer.setName(name);
        System.out.println(customer);
        Integer result = customerDAO.insertCustomer(customer);

    }
    public List<CustomerDTO> getCustomers() {
        return customerDAO.getCustomer();
    }

}
