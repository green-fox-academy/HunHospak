package com.greenfoxacademy.springstart.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping(value = "/greeting")
  @ResponseBody
  public Greeting greeting(@RequestParam String yourname) {
    Greeting greeting = new Greeting(atomicLong.addAndGet(1),  yourname);
    return greeting;
  }

}
