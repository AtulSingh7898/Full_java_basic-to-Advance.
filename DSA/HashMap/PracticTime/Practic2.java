package HashMap.PracticTime;

import java.util.HashMap;

public class Practic2 {
    public static void main(String[] args) {
        HashMap <Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "avacado");
        map.put(3, "leechi");
        map.put(4,"dragon Fruit");
        map.put(5, "pinapple");

        System.out.println(map.get(1));
    }
}
