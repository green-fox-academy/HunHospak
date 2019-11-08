package com.reddit.post.services;

import com.reddit.post.models.User;
import java.util.List;

public interface UserIntServices {

  List<User> findAll();
  User findById(Long id);
  void save(User user);
  void delete(Long id);
  List<User> findAllByName(String name);

}
