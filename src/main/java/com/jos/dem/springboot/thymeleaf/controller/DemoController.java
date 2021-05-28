package com.jos.dem.springboot.thymeleaf.controller;

import com.jos.dem.springboot.thymeleaf.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController{

  @RequestMapping("/")
  public String index(final Model model){
    Person person = new Person("josdem", "joseluis.delacruz@gmail.com");
    model.addAttribute("person", person);
    return "index";
  }

}
