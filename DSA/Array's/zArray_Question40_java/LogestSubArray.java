public class LogestSubArray {
    public static void main(String[] main){
        int num[] = {1,2,2,-3,4,-4};
        int Arrmax = 0;
        int ArrayMax = 0;
        for(int i = 0; i < num.length; i++){
            ArrayMax = Math.max(ArrayMax, num[i]+ArrayMax);

            Arrmax = Math.max(Arrmax, ArrayMax);
        }
        System.out.println(ArrayMax);
    }
    
}
