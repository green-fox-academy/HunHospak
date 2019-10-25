package hunhospak.basicwebshop.controllers;

import hunhospak.basicwebshop.model.ShopItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebshopController {

  private List<ShopItem> items = new ArrayList<>();

  public WebshopController() {
    items.add(new ShopItem("Running shoes", "Nike running shoes for every sport.", 1000.0, 5));
    items.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
    items.add(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
    items.add(new ShopItem("Wokin", "Chiken with fried rice and WOKIN sauce", 119.0, 100));
    items.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));
  }

  @GetMapping(value = "/webshop")
  public String webShop(Model model) {
    model.addAttribute("items", items);
    return "webshop";
  }

  @GetMapping(value = "/webshop/only-avaiable")
  public String webShopAvaiable(Model model) {
    model.addAttribute("items",
        items.stream()
            .filter(item -> item.getQuantityStock() > 0)
            .collect(
                Collectors.toList()));
    return "webshop";
  }

  @GetMapping(value = "/webshop/cheapest-first")
  public String webShopCheap(Model model) {
    model.addAttribute("items",
        items.stream()
            .sorted(Comparator.comparing(ShopItem::getPrice))
            .collect(Collectors.toList()));
    return "webshop";
  }

  @GetMapping(value = "/webshop/contains-nike")
  public String webShopNike(Model model) {
    model.addAttribute("items",
        items.stream()
            .filter(item -> item.getDescription().toLowerCase().contains("nike"))
            .collect(Collectors.toList()));
    return "webshop";
  }

  @GetMapping(value = "/webshop/average-stock")
  public String webShopAverage(Model model) {
    model.addAttribute("items",
        items.stream()
            .mapToDouble(ShopItem::getQuantityStock)
            .average()
            .getAsDouble());
    return "average";
  }

  @GetMapping(value = "/webshop/most-expensive")
  public String webShopExpensive(Model model) {
    model.addAttribute("items",
        items.stream()
            .mapToDouble(ShopItem::getPrice)
            .max()
            .getAsDouble());
    return "mostExpensive";
  }

  @PostMapping(value = "/webshop/search")
  public String webShopSearch(@RequestParam String look, Model model) {
    model.addAttribute("items", items.stream()
        .filter(item -> item.getName().toLowerCase().contains(look))
        .collect(Collectors.toList()));
    return "webshop";
  }

}
