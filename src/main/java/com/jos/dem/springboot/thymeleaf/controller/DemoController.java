package com.jos.dem.springboot.thymeleaf.controller;

import com.jos.dem.springboot.thymeleaf.model.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController{

  @RequestMapping("/")
  public String index(final Model model){
    Person person = new Person("josdem", "joseluis.delacruz@gmail.com");
    model.addAttribute("person", person);
    return "index";
  }

}
