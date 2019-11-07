package com.reddit.post;

import com.reddit.post.models.Post;
import com.reddit.post.services.RedditServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostApplication implements CommandLineRunner {
  private RedditServices services;

  public PostApplication(RedditServices services) {
    this.services = services;
  }

  public static void main(String[] args) {
    SpringApplication.run(PostApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Post first = new Post("First post", "https://www.youtube.com/watch?v=4cOr7JmcOas");
    Post second = new Post("Second post", "https://www.reddit.com/r/PS4Deals/");
    services.save(first);
    services.save(second);
  }
}
