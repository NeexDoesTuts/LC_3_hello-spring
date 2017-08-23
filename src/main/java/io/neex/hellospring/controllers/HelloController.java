package io.neex.hellospring.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;

@Controller
// @RequestMapping("hello") puts hello in path before every other route in this controller
public class HelloController {

    @RequestMapping(value = "")
    @ResponseBody
    // public String index() // when no get parameters access needed
    public String index(HttpServletRequest request) { // access query from request object

        String name = request.getParameter("name"); // fetch query value for name
        // safeguard when no param given
        if (name == null) {
            name = "World";
        }
        return "Hello " + name;
    }

    // GET REQUEST
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public String HelloForm() {
        String html = "<form method='post'>" +
                "<input type='text' name='name'/>" +
                "<input type='submit' value='Greet Me' />" +
                "</form>";
        return html;
    }

    // POST request
    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String HelloFormPost(HttpServletRequest request) {
        String name = request.getParameter("name");
        return "Hello " + name;
    }

    @RequestMapping(value = "goodbye")
    @ResponseBody
    public String goodbye() {
        return "Bye bye";
    }
}
