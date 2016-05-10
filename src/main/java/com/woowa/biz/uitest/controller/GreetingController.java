package com.woowa.biz.uitest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by junyoung on 2016. 5. 10..
 */
@Controller
public class GreetingController {

    @RequestMapping("/")
    public String index() {
        return "hello";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
