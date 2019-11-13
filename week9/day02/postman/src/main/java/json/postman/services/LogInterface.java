package json.postman.services;

import java.util.List;
import json.postman.models.Log;

public interface LogInterface {
  List<Log> listAll();
  void save (Log log);

}
