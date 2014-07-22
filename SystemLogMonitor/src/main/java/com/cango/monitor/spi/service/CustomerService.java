package com.cango.monitor.service;


import com.cango.monitor.dao.CustomerDAO;
import com.cango.monitor.dto.CustomerDTO;
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
