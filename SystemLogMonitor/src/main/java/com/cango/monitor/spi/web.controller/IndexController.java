package com.cango.monitor.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by caoyanfei079 on 7/22/14.
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index.html";
    }
}
