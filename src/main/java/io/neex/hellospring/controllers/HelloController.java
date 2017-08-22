package io.neex.hellospring.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;

@Controller
// @RequestMapping("hello") puts hello in path before every other route in this controller
public class HelloController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request) { // access query

        String name = request.getParameter("name"); // fetch query value for name

        if (name == null) { // safeguard when no param given
            name = "World";
        }
        return "Hello " + name;
    }

    // POST REQUEST
    public String HelloForm() {

    }



    @RequestMapping(value = "goodbye")
    @ResponseBody
    public String goodbye() {
        return "Bye bye";
    }
}
