package programmer.fox.club.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import programmer.fox.club.models.Fox;

@Controller
public class MainController {
  @Autowired
  private Fox fox;

  @GetMapping (value = "/")
  public String mainPage (Model model, @RequestParam(required = false) String name) {
    model.addAttribute("name", name);
    model.addAttribute("food", fox.getFood());
    model.addAttribute("drink", fox.getDrink());
    model.addAttribute("tricks", fox.getTricks());
    return "index";
  }

  @GetMapping(value = "/login")
  public String loginPostPage () {
    return "login";
  }

  @PostMapping(value = "/login")
  public String loginGetPage (@RequestParam String name) {
    fox.setPetName(name);
    return "redirect:/?name="+fox.getPetName();
  }

}
