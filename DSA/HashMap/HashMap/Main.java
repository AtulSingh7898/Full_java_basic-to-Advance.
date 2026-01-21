package HashMap;


import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        // HashMap<Integer, String> hashMap = new HashMap<>();
        // hashMap.put(1, "Apple");
        // hashMap.put(1, "Avacado");
        // hashMap.put(1, "dragon fruit");
        // hashMap.put(1, "blue berry");
        // hashMap.put(1, "Kiwi");
        // hashMap.put(null, "Null key Taken");
        // System.out.println("The hashmap is "+hashMap);

        // HashMap<Integer, String> hashMap = new HashMap<>();
        // hashMap.put(1, "Apple");
        // hashMap.put(2, "Avacado");
        // hashMap.put(3, "dragon fruit");
        // hashMap.put(4, "blue berry");
        // hashMap.put(5, "Kiwi");
        // hashMap.put(null, "Null key Taken");
        // System.out.println("The hashmap is "+hashMap);
        // System.out.println("The hashmap is "+hashMap.size());

        // Stores or updates a key–value pair. ✔ When you want to insert or update data

        // Hashtable <Integer, String> hashtable = new Hashtable<>();
        // hashtable.put(1, "Apple");
        // hashtable.put(2, "Avacado");
        // hashtable.put(3, "dragon fruit");
        // hashtable.put(4, "blue berry");
        // hashtable.put(5, "Kiwi");
        // hashtable.put(null, "Null key Taken");
        // System.out.println("The hashtable is "+hashtable);
        // System.out.println("The hashtable is "+hashtable.size());

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "mango");
        hashMap.put(3, "Avacado");
        hashMap.put(4, "dragon fruit");
        hashMap.put(4, "blue berry");
        hashMap.put(5, "Kiwi");

        // Returns the value linked to the key. When you want to fetch data quickly
        System.out.println("this method working to add the element inside the map"+hashMap.get(4));

        // Returns value if key exists, otherwise returns the given default value.
        System.out.println("The work with getOrDefault is: "+ hashMap.getOrDefault(4, ""));
        // Avoid NullPointerException, Best for counting frequency

        // containsKey(key) Checks whether a key exists in the map.
        System.out.println("Check the key in the exist containsKey: "+hashMap.containsKey(3));
        // Before accessing or updating a key  Validation checks

        // containsValue(value) Checks whether a value exists (slow operation).
        System.out.println("Check the contain value exist there: "+hashMap.containsValue("mango"));
        System.out.println("Check the containe value not exist there: "+hashMap.containsValue("lichi"));
        // Rare cases when you need to search values

        // remove(key) Deletes the key-value pair.
        System.out.println(hashMap.remove(3));
        System.out.println(hashMap);
        // When data is no longer needed

        // remove(key, value) Removes entry only if both key & value match.
        hashMap.remove(1, "Apple");
        System.out.println("after remove key and value both same exist there: "+hashMap);

        // size() Returns number of entries.
        System.out.println("check size of our make how many value contain this: "+hashMap.size());
        // Counting total elements

        // isEmpty() Checks if map has no entries. Validation before operations
        System.out.println("isEmpty check the hashmap is empty or not: "+hashMap.isEmpty());
        
        // clear() Removes everything from map. Resetting cache / data
        // hashMap.clear();
        System.out.println("remove all key and value an everything from our map: hashMap.clear()");

        // ITERATION METHODS (READ DATA)
        // keySet() returns all keys.
        System.out.println("The keySet() is return all key is "+hashMap.keySet());

        // values() returns all value.
        System.out.println("The values() is return all Value is "+hashMap.values());

        // entrySet()
        // Returns key–value pairs. BEST for looping, Most efficient iteration
        System.out.println("Return entrySet() key value pairs with squar braces: "+hashMap.entrySet());

        // replace(key, value) Replaces value only if key exists.
        hashMap.replace(2, "leechi");
        System.out.println("Replaces value only if key exists."+hashMap.entrySet());
        // Safe updates Avoid accidental insertions

        // replace(key, oldValue, newValue)
        // Replaces value only if old value matches. Conditional updates, Concurrency-safe logic
        hashMap.replace(5, "Kiwi", "redis");
        System.out.println("replace(key, oldValue, newValue) ");

        // compute(key, function) we don't need mostly 

        // Checks if two maps contain same entries.
        System.out.println("Use the equals(object) for hashmap :"+hashMap.equals(hashMap));

        // Print Using entrySet() + for-each  (BEST & MOST USED)
        System.out.println("use the for each loop of ");
        for(Map.Entry<Integer, String> e : hashMap.entrySet()){
            System.out.println(e.getKey()+" = "+e.getValue());
        }
       
        System.out.println("use the for each loop here");
        for(int k : hashMap.keySet()){
            System.out.println(k +" "+hashMap.get(k));
        }

        // Print Using Lambda (forEach)
        System.out.println("Using labda function ");
        hashMap.forEach((key, value)-> System.out.println(key+" "+value));

        // Iterator<Map.Entry<Integer, String> itr = hashMap.entrySet().iterator();
        // Iterator<Map.Entry<String, Integer>> it = hashMap.entrySet().iterator();

        // while (it.hasNext()) {
        //     Map.Entry<String, Integer> e = it.next();
        //     System.out.println(e.getKey() + " = " + e.getValue());
        // }
        // sha 126 

    }
    
}
