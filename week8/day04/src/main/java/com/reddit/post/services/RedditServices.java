package com.reddit.post.services;

import com.reddit.post.models.Post;
import com.reddit.post.repositories.PostRepository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedditServices implements RedditIntService{

  private PostRepository repo;

  @Autowired
  public RedditServices(PostRepository repo) {
    this.repo = repo;
  }

  @Override
  public List<Post> findAll() {
    List<Post> allPosts = new ArrayList<>();
    repo.findAll().forEach(allPosts::add);
    return allPosts;
  }

  @Override
  public Post findById(Long id) {
    return repo.findById(id).orElse(null);
  }

  @Override
  public void save(Post post) {
    repo.save(post);
  }

  @Override
  public void delete(Long id) {
    repo.deleteById(id);
  }

  @Override
  public List<Post> findAllByTitle(String title) {
    return repo.findAllByTitle(title);
  }

  @Override
  public List<Post> findAllByUpvote() {
    List<Post> top = new ArrayList<>();
    repo.findAll().forEach(top::add);
    top.sort(Comparator.comparing(Post::getVotes).reversed());
    return top;
  }

  @Override
  public void upvote(Long id) {
    Post upvoted = repo.findById(id).orElse(null);
    upvoted.setVotes(upvoted.getVotes()+1);
    repo.save(upvoted);
  }

  @Override
  public void downvote(Long id) {
    Post upvoted = repo.findById(id).orElse(null);
    upvoted.setVotes(upvoted.getVotes()-1);
    repo.save(upvoted);

  }

}
