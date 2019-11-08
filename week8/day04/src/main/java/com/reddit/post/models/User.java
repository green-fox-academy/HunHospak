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
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  String name;
  String password;

  public User() {
  }

  public User(String name, String password) {
    this.name = name;
    this.password = password;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
