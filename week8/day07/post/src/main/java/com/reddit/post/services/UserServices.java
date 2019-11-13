package com.reddit.post.services;

import com.reddit.post.models.User;
import com.reddit.post.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices implements UserIntServices {

  private UserRepository repo;

  @Autowired
  public UserServices(UserRepository repo) {
    this.repo = repo;
  }

  @Override
  public List<User> findAll() {
    List<User> myUsers = new ArrayList<>();
    repo.findAll().forEach(myUsers::add);
    return myUsers;
  }

  @Override
  public User findById(Long id) {
    return repo.findById(id).orElse(null);
  }

  @Override
  public void save(User user) {
    repo.save(user);
  }

  @Override
  public void delete(Long id) {
    repo.deleteById(id);
  }

  @Override
  public List<User> findAllByName(String name) {
    List<User> userNames = new ArrayList<>();
    repo.findAllByName(name).forEach(userNames::add);
    return userNames;
  }
}
