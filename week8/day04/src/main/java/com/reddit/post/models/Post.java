package com.reddit.post.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;

  public Post() {
  }

  public Post(String title, String url) {
    this.createdAt = new Date();
    this.title = title;
    this.url = url;
  }

  @Override
  public String toString() {
    return this.title;
  }
}
