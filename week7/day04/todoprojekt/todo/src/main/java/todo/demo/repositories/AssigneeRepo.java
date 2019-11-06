package todo.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import todo.demo.models.Assignee;

@Repository
public interface AssigneeRepo extends CrudRepository<Assignee,Long> {
}
