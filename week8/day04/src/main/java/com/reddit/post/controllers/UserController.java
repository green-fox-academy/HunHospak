package com.reddit.post.controllers;

import com.reddit.post.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

  private UserServices services;

  @Autowired
  public UserController(UserServices services) {
    this.services = services;
  }
}
