package com.reddit.post.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String url;
  private Long votes = 0L;

  public Post() {
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
  }

  @Override
  public String toString() {
    return this.title;
  }
}
