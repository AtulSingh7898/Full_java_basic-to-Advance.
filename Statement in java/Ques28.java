public class Ques28 {
    public static void main(String []args){
        int a = 9;
        if(a%2 ==0 && a%3 == 0){
            System.out.print("Its Divisible By Both");
        }else if(a%2 ==0){
            System.out.print("Its Divisible By 2");
        }else if(a%3 ==0){
            System.out.print("Its Divisible By 3");
        }else{
            System.out.println("Nahi hua to nahi kiya");
        }
    }
}
