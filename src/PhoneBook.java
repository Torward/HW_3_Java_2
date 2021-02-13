import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
private HashMap<String, Set<String>> abonent = new HashMap<>();

   public void add(String name, String phone){
       Set<String>tell = abonent.getOrDefault(name, new HashSet<>());
       tell.add(phone);
       abonent.put(name, tell);
   }
   public Set<String>get(String name){
       return abonent.get(name);
   }
}
