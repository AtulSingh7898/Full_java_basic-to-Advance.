public class UpLowCase {
    public static void main(String[] args) {
        char ch = '9';
        if(ch >= 65 && ch <= 96 ){
            System.out.println("UpperCase");
        }else if(ch >= 97 && ch <= 122){
            System.out.println("Lowercase");
        }else if(ch >= 0 && ch <= 9 || ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        }else{
            System.out.println("Spacial character");
        }

    }
    
}
