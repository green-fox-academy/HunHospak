/*
package todo.demo.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todo.demo.models.Todo;
import todo.demo.repositories.TodoRepository;
@Service
public class TodoServices implements ITodoServices{

  private TodoRepository repository;

  @Autowired
  public TodoServices(TodoRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Todo> findAll() {
    List<Todo> todoList = new ArrayList<>();
    repository.findAll().forEach(todoList::add);
    return todoList;
  }

  @Override
  public Todo findById(long id) {
    return null;
  }

  @Override
  public void save(Todo todo) {

  }

  @Override
  public void delete(long id) {

  }

  @Override
  public List<Todo> findAllByName(String name) {
    return null;
  }

  @Override
  public List<Todo> findAllByAgeAfter(Integer age) {
    return null;
  }
}
*/
