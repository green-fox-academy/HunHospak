package com.reddit.post.controllers;

import com.reddit.post.models.Post;
import com.reddit.post.services.RedditServices;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RedditController {

  private RedditServices services;

  @Autowired
  public RedditController(RedditServices services) {

    this.services = services;
  }

  @GetMapping(value = {"/","/{page}"})
  public String mainPage(Model model, @PathVariable(name = "page", required = false) Integer page ) {
    if (page==null || page==0) {
      page=0;
    }
    model.addAttribute("posts",services.findAllByUpvote()
        .stream()
        .skip(page*10)
        .limit(10)
        .collect(Collectors.toList()));
    model.addAttribute("next", page + 1);
    if (page>1) {
      model.addAttribute("previous", page - 1);
    } else {
      model.addAttribute("previous", page = 0);
    }
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

  @GetMapping(value = "/add")
  public String addPost(@ModelAttribute (name = "post") Post post) {
    return "add";
  }

  @PostMapping(value = "/add")
  public String savePost(@ModelAttribute(name = "post") Post post) {
    services.save(post);
    return "redirect:/";
  }
}
