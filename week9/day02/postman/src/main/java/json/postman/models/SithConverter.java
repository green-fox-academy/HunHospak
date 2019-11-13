package json.postman.models;

import org.springframework.stereotype.Service;

@Service
public class SithConverter {
  public String convert(String input) {
    String sith_text="";
    String [] splittedText = input.split("\\.");
    for (int i = 0; i < splittedText.length; i++) {
      String [] dottedText = splittedText[i].trim().split("\\s+");
      for (int j = 0; j < dottedText.length-1 ; j+=2) {
        sith_text += dottedText[j+1]+ " " + dottedText[j] +" ";
      }
      sith_text += dottedText[dottedText.length-1] + ". erg ";
    }
    return sith_text;
  }
}
