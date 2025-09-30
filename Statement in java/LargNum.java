public class LargNum {
    public static void main(String []arg){
    int a = 10;
    int b = 16;
    int c = 9;

    if(a > b && a > c ){
        System.out.println(a+" Is Largest: ");
    }else if(b > a&& b>c ){
        System.out.println(b+" is Largest: ");
    }else if(c > a &&  c > b){
        System.out.println(c+" Is Largest: ");
    }else{
        System.out.println("Not comparision");
    }
    }
    
}
