package com.reddit.post.repositories;

import com.reddit.post.models.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  List<User> findAllByName(String name);
}
