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
    Post third = new Post("Second time doing this", "https://www.reddit.com/r/PS4Deals/");
    Post fouth = new Post("Look at this cat!!", "https://www.reddit.com/r/PS4Deals/");
    Post fifth = new Post("OMG YOU WONT BELIEVE IT", "https://www.reddit.com/r/PS4Deals/");
    Post sixth = new Post("Jeeez another post", "https://www.reddit.com/r/PS4Deals/");
    Post seventh = new Post("Csoszi is doing crazy stuff", "https://www.reddit.com/r/PS4Deals/");
    Post eigth = new Post("Yet again", "https://www.reddit.com/r/PS4Deals/");
    Post nineth = new Post("CNN news on new tweet of Trump", "https://www.reddit.com/r/PS4Deals/");
    Post tenth = new Post("Laci is at greenfox!", "https://www.reddit.com/r/PS4Deals/");
    Post eleventh = new Post("Oh no!", "https://www.reddit.com/r/PS4Deals/");
    services.save(first);
    services.save(second);
    services.save(third);
    services.save(fouth);
    services.save(fifth);
    services.save(sixth);
    services.save(seventh);
    services.save(eigth);
    services.save(nineth);
    services.save(tenth);
    services.save(eleventh);
  }
}
