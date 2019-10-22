import static java.util.stream.Collectors.toMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    List<Integer> evenNumbers = numbers.stream()
        .filter(number -> number % 2 == 0)
        .collect(Collectors.toList());
    System.out.println(evenNumbers);

    List<Integer> squaredNumbers = numbers.stream()
        .filter(number -> number > 0)
        .map(num -> num * num)
        .collect(Collectors.toList());
    System.out.println(squaredNumbers);

    List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
    List<Integer> moreThanTwenty = numbers2.stream()
        .filter(num -> num * num > 20)
        .collect(Collectors.toList());
    System.out.println(moreThanTwenty);

    IntSummaryStatistics stats = numbers.stream()
        .filter(num -> num % 2 == 1)
        .mapToInt((x) -> x)
        .summaryStatistics();
    System.out.println(stats.getAverage());

    List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    IntSummaryStatistics sumOfOdds = numbers3.stream()
        .filter(num -> num % 2 == 1)
        .mapToInt((x) -> x)
        .summaryStatistics();
    System.out.println(sumOfOdds.getSum());

    String lista = "moamAMSDmasmfsdmfsklnfaASdan";
    List<Character> findUppercases = lista.codePoints()
        .mapToObj(c -> (char) c)
        .filter(Character::isUpperCase)
        .collect(Collectors.toList());
    System.out.println(findUppercases);

    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");
    List<String> startsWith = cities.stream()
        .filter(city -> city.startsWith("C"))
        .collect(Collectors.toList());
    System.out.println(startsWith);

    List<Character> myCharacters = Arrays.asList('c', 'y', 'a', 'm', 'a', 't', 'e');
    String hello = "hi mate ";
    String together = myCharacters.stream().map(String::valueOf).collect(Collectors.joining());
    System.out.println(together);

    String hello2 = "ehaklmkldafklmdfl";
    Map<Character, Integer> frequencies = hello2.chars().boxed()
        .collect(toMap(
            k -> (char) k.intValue(),
            v -> 1,
            Integer::sum));
    System.out.println("Frequencies:\n" + frequencies);

    List<Fox> foxes = new ArrayList<>();
    Fox fox1 = new Fox("Feri", "Green", 4);
    Fox fox2 = new Fox("Sanyi", "Red", 3);
    Fox fox3 = new Fox("Csaba", "Orange", 6);
    Fox fox4 = new Fox("Vuk", "Green", 2);
    Fox fox5 = new Fox("László", "Grey", 8);

    foxes.add(fox1);
    foxes.add(fox2);
    foxes.add(fox3);
    foxes.add(fox4);
    foxes.add(fox5);

    List<Fox> greenFoxes = foxes.stream()
        .filter(fox -> fox.getColor().equals("Green"))
        .collect(Collectors.toList());
    System.out.println(greenFoxes);

    List<Fox> ageAndColor = foxes.stream()
        .filter(fox -> fox.getAge() < 5)
        .filter(fox -> fox.getColor().equals("Green")).collect(Collectors.toList());
    System.out.println(ageAndColor);

    Map<String, Integer> colorFreq = foxes.stream()
        .collect(toMap(
            Fox::getColor,
            v -> 1,
            Integer::sum));
    System.out.println(colorFreq);
  }




}
