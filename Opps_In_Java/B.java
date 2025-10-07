//access superclass mathod

class A {
    void show(){
        System.out.println("This the super class ");
    }
}

class B extends A{
    void show(){
        super.show();
        System.out.println("This is class B ");
    }
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}