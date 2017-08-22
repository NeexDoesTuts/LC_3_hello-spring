package io.neex.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;

@Controller
public class HelloController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Hello Spring";
    }
}
