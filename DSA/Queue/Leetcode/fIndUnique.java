import java.util.LinkedList;
import java.util.Queue;

public class fIndUnique{
    public static int firstUniqChar(String s) {
        Queue<Integer> queue = new LinkedList<>();
        int[] freq = new int[26];

        for(int i = 0; i <s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
            queue.offer(i);

            while(!queue.isEmpty() && freq[s.charAt(queue.peek())-'a']>1){
                queue.poll();
            }
        }
        if(queue.isEmpty()){
            return -1;
        }

        return queue.peek();
    }
    public static void main(String[] args) {
        // String s  = "leetcode";
        String s = "loveleetcode";

        System.out.println(firstUniqChar(s));
    }

}