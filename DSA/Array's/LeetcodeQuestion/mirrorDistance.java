public class mirrorDistance {
    public static void main(String[] args) {
        int n = 52;
        int temp = n;
        int result = 0;
        
        while(temp != 0){
            int digit = temp%10;
            result = 10*result+digit;
            temp /= 10;
        }
        int res = 0;
        // if(n > result){
            res = Math.abs(n-result);
        // }else{
        //     res = result - n;
        // }


        System.out.println(res);
    }
}
