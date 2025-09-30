public class massage{
   String massage;

   massage(){
    massage = "This the first massage for you";
   }
   void display(){
    System.out.println("The message is: "+massage);
   }

   public static void main(String args[]){
    massage msg = new massage();
    msg.display();
    
   }
}
