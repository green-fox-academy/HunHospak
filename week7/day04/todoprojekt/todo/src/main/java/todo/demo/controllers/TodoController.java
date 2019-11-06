package todo.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import todo.demo.models.Assignee;
import todo.demo.models.Todo;
import todo.demo.repositories.AssigneeRepo;
import todo.demo.repositories.TodoRepository;

@Controller()
@RequestMapping("/todo")
public class TodoController implements CommandLineRunner {

  private TodoRepository repository;
  private AssigneeRepo assignee;

  @Autowired
  public TodoController(TodoRepository repository, AssigneeRepo assignee) {
    this.repository = repository;
    this.assignee = assignee;
  }

  @GetMapping(value = {"/", "/list"})
  public String mainPage(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute("todo", repository.findAllByDoneIsFalse());
      return "todolist";
    } else {
      model.addAttribute("todo", repository.findAll());
      return "todolist";
    }
  }

  @GetMapping(value = "/assignee")
  public String assignPage (Model model) {
    model.addAttribute("ref", assignee.findAll());
    return "assignee";
  }

  @GetMapping(value = "/add")
  public String addPage(@ModelAttribute(name = "todo") Todo todoList) {
    return "add";
  }

  @PostMapping(value = "/add")
  public String addValues(@ModelAttribute(name = "todo") Todo todoList) {
    repository.save(todoList);
    return "redirect:/todo/";
  }

  @GetMapping(value = "/delete/{id}")
  public String deleteValues(@PathVariable (name = "id") Long id) {
    repository.deleteById(id);
    return "redirect:/todo/";
  }

  @PostMapping(value = "/search")
  public String publicValues(@RequestParam(value = "search") String search, Model model) {
    List<Todo> titleList = repository.findAllByTitle(search);
    model.addAttribute("todo",titleList);
    return "todolist";
  }

  @GetMapping(value = "/assignee/todo")
  public String assigneeTodo(Model model) {
    model.addAttribute("todo", assignee.findAll());
    return "todolist";
  }

  @Override
  public void run(String... args) throws Exception {
    /*repository.save(new Todo("Javascript",false,false));
    repository.save(new Todo("Java",true,false));
    repository.save(new Todo("Python",false,true));
    repository.save(new Todo("C++",false,true));
    repository.save(new Todo("C#",true,true));
    repository.save(new Todo("Ruby",false,true));
    assignee.save(new Assignee("Robi", "robi@gmail.com"));
    assignee.save(new Assignee("Feri", "feri@gmail.com"));
    assignee.save(new Assignee("Gabor", "gabor@gmail.com"));*/

    Assignee adam = new Assignee("Adam", "hospak88@gmail.com");
    Assignee balint = new Assignee("Balint", "balintkiss@gmail.com");
    Assignee peter = new Assignee("Peter", "torokpitt@gmail.com");
    Todo dailyTask = new Todo("Green Fox Exercise", true, false);
    Todo dailyTask2 = new Todo("Training", false, false);
    Todo dailyTask3 = new Todo("Get Up", true, true);
    Todo dailyTask4 = new Todo("Go Home", false, false);

    adam.addTodo(dailyTask);
    adam.addTodo(dailyTask2);
    adam.addTodo(dailyTask3);
    adam.addTodo(dailyTask4);

    assignee.save(adam);
    assignee.save(balint);
    assignee.save(peter);

  }
}
