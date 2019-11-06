package todo.demo.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Assignee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String email;
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "assignee")
  private List<Todo> todoList;

  public Assignee() {
    todoList =  new ArrayList<>();
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
    todoList =  new ArrayList<>();
  }

  public List<Todo> getTodoList() {
    return todoList;
  }

  public void addTodo(Todo todo) {
    todo.setAssignee(this);
    todoList.add(todo);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return this.getName();
  }
}
