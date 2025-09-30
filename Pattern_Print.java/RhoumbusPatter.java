public class RhoumbusPatter{

    static void printSpace(int min, int max){
        if(min > max) return;
        System.out.print(" ");
        printSpace(min+1, max);
    }

    static void printStar(int min, int max){
        if(min > max){
            return;
        }
        System.out.print("*");
        printStar(min+1, max);
    }
    static void printrow(int min, int num){
        if(min > num) return;
        printSpace(1, num-min);
        printStar(1, 2*num-1);
        System.out.println();
        printrow(min+1, num);
    }

    public static void main(String[] args) {
        int num = 5;
        printrow(1, num);
        // for(int i = 1; i < num; i++){
        //     for(int j = 1; j < num-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= 2*num; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
    }
}