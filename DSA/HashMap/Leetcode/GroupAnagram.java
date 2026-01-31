package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static List<List<String>> groupAnagram(String[] str){
        HashMap <String, List<String>> map = new HashMap<>();
        for(String strs : str){
            char chars[] = strs.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] str = {"eat","tea","tan","ate","nat","bat"};

        List< List<String>> result = groupAnagram(str);
        System.out.println(result);

    }
}
