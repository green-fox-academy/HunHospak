package com.reddit.post.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String password;
  private boolean enabled = true;
  private String authority = "USER";

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
  private List<Post> posts;

  public User() {
    posts = new ArrayList<>();
  }

  public User(String name, String password) {
    posts = new ArrayList<>();
    this.name = name;
    this.password = password;
  }

  @Override
  public String toString() {
    return this.name;
  }

  public void addPost(Post post) {
    post.setUser(this);
    posts.add(post);
  }
}
