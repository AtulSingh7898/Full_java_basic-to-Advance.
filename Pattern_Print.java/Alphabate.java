public class Alphabate {

    static void forStar(int min, int max, int promin, int promax){
        if(min>max) return;
        if(min == 1|| min == max || promin == 1 || promin == 2*promax){
            System.out.print("* ");
        }else{
            System.out.print("  ");
        }
        // System.out.print("* ");
        forStar(min+1, max, promin,promax);

    }
    // // static void forStar2(int min, int max){
    // //     if(min>max) return;
    // //     System.out.print("*");
    // //     forStar2(min+1, max);
    // }

    static void pattern(int min, int max){
        if(min>2*max) return;
        int space = (min > max) ? 2*max-min : min;
        int star = (min > max) ? min - max+1 : max-min+1;
        forSpace(1, space,min,max);
        forStar(1,star,min,max);
        // forStar2(1,star);
        System.out.println();
        // if(min == max){
        //     System.out.print("*");
        // }
        pattern(min+1, max);

    }
    static void forSpace(int min, int max,int promin, int promax){
        if(min > max) return;
        
        // System.out.print(" ");
        if(promin == promax ){
        System.out.print("* ");
        }
        else{
            System.out.print(" ");
        }
        forSpace(min+1, max,promin,promax);
    }

    public static void main(String[] args) {
        int num = 5;
        int n = 9; // number of rows (adjust to fit properly)
        pattern(1,num);
        
        // for(int i = 1; i <= 2*num; i++){

        //     int space = (i > num )? 2*num-i+1 : i-1+1;
        //     int star;
        //     for(int j = 1;  j <= space; j++){
        //         if(i == num ){
        //             System.out.print("* ");
        //         }else
        //         System.out.print(" ");
        //         // System.out.println();
        //     }
        //     if(i > num) {
        //         star = i-num;
        //     }else{
        //         star = num - i+1;
        //     }
        //     for(int j = 1; j<= star; j++ ){
        //         if(j == 1 || j == star || i == 1 || i == 2*num){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
                
        //     }
        //     for(int j = 1;  j <= space; j++){
        //         if(i == num ){
        //             System.out.print("* ");
        //         }else
        //         System.out.print(" ");
        //         // System.out.println();
        //     }
        //     System.out.println();
            
        // }

       

    }
    
}


