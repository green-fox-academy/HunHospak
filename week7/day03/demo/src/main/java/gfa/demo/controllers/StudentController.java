package gfa.demo.controllers;

import gfa.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
  @Autowired
  private StudentService studentService;

  @GetMapping(value = "/gfa")
  public String mainPage () {
    return "index";
  }

  @GetMapping(value = "/gfa/list")
  public String listPage (Model model) {
    model.addAttribute("students",studentService.findAll());
    return "list";
  }

  @PostMapping(value = "gfa/add")
  public String addPage () {
    return "add";
  }

  @GetMapping(value = "gfa/save")
  public String saveStudent (@RequestParam String name) {
    studentService.save(name);
    return "redirect:/gfa";
  }
}
