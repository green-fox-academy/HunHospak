package json.postman.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MainService {

  public int arraySum(List<Integer> numbers) {
    int result = 0;
    for (int i = 0; i < numbers.size() ; i++) {
      result += numbers.get(i);
    }
    return result;
  }


  public int arrayMultiply(List<Integer> numbers) {
    int result = 1;
    for (int i = 0; i < numbers.size() ; i++) {
      result *= numbers.get(i);
    }
    return result;
  }


  public List<Integer> arrayDouble(List<Integer> numbers) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < numbers.size() ; i++) {
      result.add(numbers.get(i)*2);
    }
    return result;
  }

  public int sum(int number) {
    int start=0;
    for (int i = 0; i < number+1; i++) {
      start += i;
    }
    return start;
  }

  public int factor(int number) {
    int start = 1;
    for (int i = 1; i < number+1; i++) {
      start *= i;
    }
    return start;
  }


}
