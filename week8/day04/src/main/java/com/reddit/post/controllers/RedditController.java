package com.reddit.post.controllers;

import com.reddit.post.services.RedditServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RedditController {

  private RedditServices services;

  @Autowired
  public RedditController(RedditServices services) {
    this.services = services;
  }

  @GetMapping(value = "/")
  public String mainPage(Model model) {
    model.addAttribute("posts",services.findAll());
    return "index";
  }

  @GetMapping(value = "/upvote/{id}")
  public String upVote (@PathVariable(name = "id") Long id) {
    services.upvote(id);
    return "redirect:/";
  }

  @GetMapping(value = "/downvote/{id}")
  public String downVote (@PathVariable(name = "id") Long id) {
    services.downvote(id);
    return "redirect:/";
  }
}
