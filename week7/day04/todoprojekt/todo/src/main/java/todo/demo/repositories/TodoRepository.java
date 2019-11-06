package todo.demo.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import todo.demo.models.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByDoneIsFalse();
  List<Todo> findAllByTitle(String Title);
}
