import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    Map<String, String> schools = new HashMap<>(); 
    schools.put("Auberon", "GRC");
    schools.put("Damien", "OSU");
    schools.put("Xinting", "UW");
    schools.put("Tina", "GRC");

    schools.put("Damien", "CPH");
    //System.out.println(schools.get("Damien"));
    //System.out.println(schools);

    Map<String, Integer> scores = new HashMap<>();

    scores.put("Nupur", 345);
    scores.put("Alex", 120);
    scores.put("Stace", 67);

    //System.out.println(scores.get("Stace"));
    int oldScore = scores.get("Stace");
    int newScore = oldScore + 10; 
    scores.put("Stace", newScore);
    scores.replace("Stace", newScore);

    String[] list = {"yes", "I", "will", "yes", "I", "said", "yes"};

    Map<String, Integer> countWords = countMap(list);

    System.out.println(countWords);

    for(String word : countWords.keySet()){
      System.out.println(word);
    }

  }

  public static Map<String, Integer> countMap(String[] words){
    Map<String, Integer> counter = new HashMap<>();
    for(String word: words){
      if(counter.containsKey(word)){
        counter.replace(word, counter.get(word) + 1);
      }
      else{
        counter.put(word, 1);
      }
    }
    return counter;
  }
}