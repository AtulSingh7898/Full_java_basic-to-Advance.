

public class SlidingWindow {

    public static void main(String[] args) {
        int n = 7;
        int first = 0, second = 1;
        System.out.print("The finbonaci Sequece is : ");
        for(int i = 1; i <= n; i++){
            System.out.print(first+" ");
            int next = first+second;
            first = second;
            second = next;
        }
        
    }
}