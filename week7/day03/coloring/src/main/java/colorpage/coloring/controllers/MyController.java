package colorpage.coloring.controllers;

import colorpage.coloring.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
  @Autowired
  UtilityService services;

  @GetMapping(value = "/useful")
  public String mainPage (Model model) {
    model.addAttribute("services", services);
    return "index";
  }

  @GetMapping(value = "/useful/colored")
  public String coloredPage (Model model) {
    model.addAttribute("color", services.randomColor());
    return "color";
  }

  @GetMapping(value = "/useful/email")
  public String emailPage (Model model, @RequestParam (name="email", required = false) String email) {
    if (services.validateEmail(email)) {
      model.addAttribute("color", "color:green");
      model.addAttribute("email", email);
    } else {
      model.addAttribute("color", "color:red");
      model.addAttribute("email", email);
    }
    return "validator";
  }

  @GetMapping("/useful/caesar")
  public String caesar (Model model, @RequestParam("text") String text, @RequestParam("number") int number) {
    model.addAttribute("caesar", services.caesar(text,number));
    return "index";
  }

}
