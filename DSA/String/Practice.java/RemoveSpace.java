public class RemoveSpace {
    public static void main(String[] args){
        String name = "Atul Singh Manihar";
        System.out.println(name.replace(" ", ""));

        // converst string Number int integer Number 
        String s =    "          1234                 ";
    //    the name spacetrim() : Removes leading and trailing whitespace
       s = s.trim();
       System.out.println(s);
        // int n = 1500;
        // int res = n - Integer.parseInt(s);
        // System.out.println(res);

        String case1 = "Hellow";
        String case2 = "helLow";
        System.out.println(case1.equals(case2));
        System.out.println("ignore the cpicate and small case match only characters: "+case1.equalsIgnoreCase(case2));


        
    }
    
}
