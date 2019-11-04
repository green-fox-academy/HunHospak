package programmer.fox.club.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import programmer.fox.club.models.Fox;
import programmer.fox.club.services.FoxServices;

@Controller
public class MainController {

  private FoxServices service;

  @Autowired
  public MainController(FoxServices service){
    this.service=service;
  }

  @GetMapping (value = "/")
  public String mainPage (Model model, @RequestParam(required = false) String name) {
   if (service.hasName(name)) {
     model.addAttribute("name", name);
     model.addAttribute("food", service.getServFood(name));
     model.addAttribute("drink", service.getServDrink(name));
     return "index";
   } else {
     model.addAttribute("fox", new Fox());
     return "login";
   }
  }

  @GetMapping(value = "/login")
  public String loginPostPage (Model model) {
    model.addAttribute("fox", new Fox());
    return "login";
  }

  @PostMapping(value = "/login")
  public String loginGetPage (@ModelAttribute Fox fox) {
    service.add(fox);
    return "redirect:/?name="+fox.getPetName();
  }

  @GetMapping(value = "/nutritionstore")
  public String nutritionPage (Model model) {
    model.addAttribute("foodlist", service.());
    return "nutritionStore";
  }

}
