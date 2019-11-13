package com.reddit.post.repositories;

import com.reddit.post.models.Post;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  List<Post> findAllByTitle(String title);
}
