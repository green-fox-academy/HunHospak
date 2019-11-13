package json.postman.controllers;

import java.util.Date;
import json.postman.models.AppendA;
import json.postman.models.ArrayInput;
import json.postman.models.ArrayOutPut;
import json.postman.models.ArrayOutPutArr;
import json.postman.models.Data;
import json.postman.models.DoUntil;
import json.postman.models.ErrorClass;
import json.postman.models.Greet;
import json.postman.models.Log;
import json.postman.models.LogOutPut;
import json.postman.models.Sith;
import json.postman.models.SithConverter;
import json.postman.models.SithOut;
import json.postman.models.UntilResponse;
import json.postman.services.LogService;
import json.postman.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

  @Autowired
  MainService service;

  @Autowired
  SithConverter converter;

  @Autowired
  LogService logs;

  @GetMapping("/doubling")
  public ResponseEntity<Object> doublingSite(@RequestParam(required = false) Integer input) {
    logs.save(new Log(new Date(), "/doubling", "input: " + input));
    if (input != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Data(input));
    } else {
      return ResponseEntity.status(HttpStatus.OK).body(new ErrorClass("Please provide an input!"));
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<Object> greeterSite(@RequestParam(required = false) String name,
      @RequestParam(required = false) String title) {
    logs.save(new Log(new Date(), "/greeter", "name" + name + ", title " + title));
    if (name != null && title != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new Greet(name, title));
    } else if (name != null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorClass("Please provide a title!"));
    } else if (title != null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorClass("Please provide a name!"));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorClass("Please provide a name and a title!"));
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<Object> appendASite(@PathVariable(required = false) String appendable) {
    logs.save(new Log(new Date(), "/appenda", "appendable: " + appendable));
    if (appendable != null) {
      return ResponseEntity.status(HttpStatus.OK).body(new AppendA(appendable));
    } else {
      return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
    }
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<Object> doUntil(@PathVariable(name = "action", required = false) String action, @RequestBody
      DoUntil number) {
    logs.save(new Log(new Date(), "/dountil", "action: " + action + ", until: " + number.getUntil()));
    if (action.contains("sum")) {
      return ResponseEntity.status(HttpStatus.OK).body(new UntilResponse(service.sum(number.getUntil())));
    } else if (action.contains("factor")) {
      return ResponseEntity.status(HttpStatus.OK)
          .body(new UntilResponse(service.factor(number.getUntil())));
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity<Object> arrayHandler(@RequestBody ArrayInput arrayInput) {
    logs.save(new Log(new Date(), "/arrays", "what: " + arrayInput.getWhat() + " action: " + arrayInput.getNumbers()));
    if (arrayInput.getWhat().contains("sum")) {
      return ResponseEntity.status(HttpStatus.OK).body(new ArrayOutPut(service.arraySum(arrayInput.getNumbers())));
    } else if (arrayInput.getWhat().contains("multiply")) {
      return ResponseEntity.status(HttpStatus.OK).body(new ArrayOutPut(service.arrayMultiply(arrayInput.getNumbers())));
    } else if (arrayInput.getWhat().contains("double")) {
      return ResponseEntity.status(HttpStatus.OK).body(new ArrayOutPutArr(service.arrayDouble(arrayInput.getNumbers())));
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .body(new ErrorClass("Please provide what to do with the numbers!"));
    }
  }

  @GetMapping("/logs")
  public ResponseEntity<LogOutPut> logHandler() {
    return ResponseEntity.status(HttpStatus.OK).body(new LogOutPut(logs.listAll(), logs.listAll().size()));
  }

  @PostMapping("/sith")
  public ResponseEntity<SithOut> sithReverser(@RequestBody Sith text) {
    return ResponseEntity.status(HttpStatus.OK).body(new SithOut(converter.convert(text.getText())));
  }
}
