package com.reddit.post.controllers;

import com.reddit.post.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  private UserServices services;

  @Autowired
  public UserController(UserServices services) {
    this.services = services;
  }

  @GetMapping(value = "/register")
  public String registerUser() {
    return "register";
  }

  @PostMapping(value = "/register")
  public String saveUser(@RequestParam String user, @RequestParam String password) {

  }
}
