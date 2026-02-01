public class InitialCode{
    public static void main(String[] args){
        String s = "Hellow#!-`~r32315";
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);
        char[] ch = s.toCharArray();
        int sum  = 0;

        for(char num : ch){
            if(Character.isDigit(num)){
                sum += num-'0';
            }
        }
        System.out.println(sum);

        String str = "Arun";
        str=str.concat(" singh");
        System.out.println(str);

        String a = "java";
        String b = "java";
        String c = new String("java");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println("after .equals use ");


        System.out.println(a.equals(b));
        System.out.println(b.equals(a));
        System.out.println(a.equals(c));
        System.out.println(c.equals(b));
        System.out.println(b.equals(c));

        StringBuilder sb = new StringBuilder("Atul singh manihar");
        sb.append(" You are Seleted in jp morgan");
        System.out.println(sb);

        
        String reverse = "madam";
        char res[] = reverse.toCharArray();
        int count = 0;
        String  resv = "";
        for(int i = reverse.length()-1; i >= 0; i--){
            resv += reverse.charAt(i);
            count++;
        }
        System.out.println(resv);
        System.out.println("the string count is: "+count);



        // int i = 0;
        // int j = res.length-1;
        // while(i<=j){
        //     char temp = res[i];
        //     res[i] = res[j];
        //     res[j] = temp;
        //     i++;
        //     j--;
        // }
        // String rv = "";
        // for(char cs: res){
        //     rv += cs;
        // }
        // System.out.println(rv.equals(reverse));

        


    }
}