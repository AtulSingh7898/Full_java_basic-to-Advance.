public class Practic{
    

    
    static int exchangBottle(int n, int x){
        if(x>n) return n;
        int empty = 0;
        int consumed = 0;

        while(n != 0){
            consumed += n;
            empty += n;
            n = empty/x;
            empty = empty%x;
        }
        return consumed;
    }

    public static void main(String[] args) {
        int num = 10;
        int num2 = 3;
        int result = exchangBottle(num, num2);
        System.out.println(result);
    }
}