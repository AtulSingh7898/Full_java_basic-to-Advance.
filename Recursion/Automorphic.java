public class Automorphic {

    static boolean automorphicNum(int num, int Square){
        if(num == 0) return true;

        if(Square%10 != num%10){
            return false;
        }

        return automorphicNum(num/10, Square/10);
    }

    public static void main(String[] args) {
        int num = 25;
        int Square = num*num;
        boolean sum = automorphicNum(num, Square);
        if(sum) {
            System.out.println("The Number is Automorphic");
        }
    }
    
}
