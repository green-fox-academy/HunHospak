package helloworld.dependency.controller;

import helloworld.dependency.services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
  UtilityService services;

  @GetMapping(value = "/useful")
  public String mainPage (Model model) {
    model.addAttribute("services", services);
    return "index";
  }

  @GetMapping(value = "/useful/colored")
  public String coloredPage (Model model) {
    model.addAttribute("color", services.randomColor());
    return "index";
  }

}
