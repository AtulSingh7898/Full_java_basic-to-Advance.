public class Reverse {
    public static void main(String[] args) {
        int sum = 0;
        int n = 456;
        

        for(int i = n; i != 0; i /=10){
            int Store = i%10; //456%10 = 6
            sum = sum*10+Store; //0*10+6 = 6
        }
        System.out.println(sum);
    }
}
