import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Pet>map= new HashMap<>();
        map.put("Alabai",new Dog("Alabai"));
        map.put("Koshka",new Cat("Мышык"));
        for (Map.Entry<String,Pet>entry:map.entrySet()){
            String string = entry.getKey();
            Pet pet = entry.getValue();
            System.out.println("name: "+string+"teep: " + pet.getClass().getSimpleName());
        }

    }
}