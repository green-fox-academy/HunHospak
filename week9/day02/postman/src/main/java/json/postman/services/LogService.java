package json.postman.services;

import java.util.ArrayList;
import java.util.List;
import json.postman.models.Log;
import json.postman.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService implements LogInterface {

  @Autowired
  LogRepository repo;

  @Override
  public List<Log> listAll() {
    List<Log> myList = new ArrayList<>();
    repo.findAll().forEach(myList::add);
    return myList;
  }

  @Override
  public void save(Log log) {
    repo.save(log);
  }
}
