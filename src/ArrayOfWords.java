
import java.util.*;

public class ArrayOfWords {


    public static String[] words = {"Он", "точно", "был", "Он", "был", "со", "мною", "жизнь",
            "Всю", "жизнь", "свою", "короткую", "со", "мною",
            "Он", "прошагал", "Теперь", "крестом", "с", "резьбою",
            "Остался", "с", "нами", "он", "сбежавший", "в", "неба", "синь"
    };
    public static List<String> list = new ArrayList<>(Arrays.asList(words));
    public static HashMap<String, Integer> map = new HashMap<>();
    public static HashMap<String, Integer> uniq = new HashMap<>();

    public static void main(String[] args) {
        for (String string : list) {
            Integer val = map.get(string);
            map.put(string, val == null ? 1 : val + 1);
            uniq.put(string, val == null ? 1 : val + 1);
            if (uniq.get(string) > 1) {
                uniq.remove(string);
            }
        }
        System.out.println("Всего слов: " + list.size());
        System.out.println("Повторения: " + map);
        System.out.println("Уникальные слова: " + uniq);
    }

}


