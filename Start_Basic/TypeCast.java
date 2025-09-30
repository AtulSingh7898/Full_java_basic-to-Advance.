public class TypeCast {
    //Type Casting : Implicit and Explicit (Primitive Type Casting )
    public static void main(String[] args) {
        System.out.println("Implicit Type Casing: ");

        byte b=10;
        short s=b;
        int i=s;
        long l=i;
        float f=l;
        double d=f;

        System.out.println("byte b= "+ b);
        System.out.println("short s=b ->"+ s);
        System.out.println("int i=s ->"+ i);
        System.out.println("long l=i ->"+ l);
        System.out.println("float f=l ->"+ f);
        System.out.println("double d=f ->"+ d);
        System.out.println();


        System.out.println("Explicit Type Casing: ");

        double d1=99.99;
        float f1=(float)d1;
        long l1=(long)f1;
        int i1=(int)l1;
        short s1=(short)i1;
        byte b1=(byte)s1;

        System.out.println("double d1 = "+ d1);
        System.out.println("float f1=(float)d1 -> "+f1);
        System.out.println("long l1=(long)d1 -> "+l1);
        System.out.println("int i1=(int)d1 -> "+i1);
        System.out.println("short s1=(short)d1 -> "+s1);
        System.out.println("byte b1=(byte)d1 -> "+b1);
         
         
         

    }

}
