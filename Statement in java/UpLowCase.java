public class UpLowCase {
    public static void main(String[] args) {
        char ch = 51;
        if(ch >= 65 && ch <= 96 ){
            System.out.println("UpperCase");
        }else if(ch >= 97 && ch <= 122){
            System.out.println("Lowercase");
        }else if(ch >= 48 && ch <= 56){
            System.out.println("Digit");
        }else{
            System.out.println("Spacial character");
        }

    }
    
}
