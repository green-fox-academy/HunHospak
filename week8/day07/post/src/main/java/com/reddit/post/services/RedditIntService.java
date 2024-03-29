package com.reddit.post.services;

import com.reddit.post.models.Post;
import java.util.List;

public interface RedditIntService {
  List<Post> findAll();
  Post findById(Long id);
  void save(Post post);
  void delete(Long id);
  List<Post> findAllByTitle(String title);
  List<Post> findAllByUpvote();
  void upvote(Long id);
  void downvote(Long id);
}
