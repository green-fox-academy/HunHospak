package simba.bank.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import simba.bank.models.BankAccount;

@Controller
public class BankAccountController {
List<BankAccount> bankAccounts;

  public BankAccountController() {
    bankAccounts = new ArrayList<>();
    bankAccounts.add(new BankAccount("Simba", 2000.0, "lion", true,false));
    bankAccounts.add(new BankAccount("Mufasa", 4000.0, "lion", true,true));
    bankAccounts.add(new BankAccount("Timon", 2000.0, "suricate", false,false));
    bankAccounts.add(new BankAccount("Pumba", 2000.0, "hog", false,false));
  }

  @GetMapping(value = {"/", ""})
  public String showAccount(Model model) {
      model.addAttribute("animalList", bankAccounts);
    return "index";
  }

  @PostMapping(value = "/add/{id}")
  public String addPlusMoney(@PathVariable(name = "id") Integer id, Model model) {
    if (bankAccounts.get(id).isKing()) {
      bankAccounts.get(id).setBalance(bankAccounts.get(id).getBalance()+100);
    } else {
      bankAccounts.get(id).setBalance(bankAccounts.get(id).getBalance()+10);
    }
    model.addAttribute("animalList", bankAccounts);
    return "redirect:/";
  }
}
