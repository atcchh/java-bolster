package com.cango.monitor.web.controller;

import com.cango.monitor.dto.CustomerDTO;
import com.cango.monitor.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by caoyanfei079 on 7/22/14.
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "/customer/list", method = RequestMethod.GET)
    public ModelAndView index() {
        List<CustomerDTO> customers = customerService.getCustomers();
        return new ModelAndView("/customer/list").addObject("customers",customers);
    }
}
