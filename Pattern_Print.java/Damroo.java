public class Damroo {



    static void forSpace(int start, int end, int Promin, int Promax){
        if(start > end) return;
        if(Promin == Promax){
            System.out.print("* ");
        }else{
            System.out.print(" ");
        }
        // System.out.print(" ");
        forSpace(start+1, end, Promin, Promax);
    }
    static void forstar(int start, int end, int Promin, int Promax){
        if(start > end) return;
        if(start == 1 || start == end || Promin == 1 || Promin == 2*Promax){
            System.out.print("* ");
        }else{
            System.out.print("  ");
        }
        forstar(start+1, end, Promin, Promax);
    }

    static void pattern(int start , int num){
        if(start > 2*num) return;
        int space = (start > num) ? 2*num - start : start-1;
        int star = (start > num) ? start - num : num - start+1; 
        forSpace(1, space, start,num);
        forstar(1, star,start,num);
        System.out.println();
        pattern(start+1, num);
    }

    public static void main(String[] args) {
        int num = 5;
        pattern(1, num);

        // for(int i = 1; i <= num*2; i++){
        //     int space = (i > num) ? 2*num-i : i-1;
        //     int star = (i > num) ? i - num : num-i+1;

        //     for(int j = 1; j <= space; j++){
        //         if(i == num){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     for(int j = 1; j <= star; j++){
        //         if(i == 1 || j == 1 || j == star || i == 2*num){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
            
        // }
        
        
        
    }
    
}
