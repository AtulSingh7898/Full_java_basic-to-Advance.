class A{
    void show(){
        System.out.println("The mathod in A got  called class");
    }
}

class B extends A {

    void show(){
        super.show();
        System.out.println("The mathod class B  got Called ");
    }
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
    
}
