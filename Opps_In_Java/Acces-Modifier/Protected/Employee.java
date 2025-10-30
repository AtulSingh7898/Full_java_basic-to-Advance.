// package Protected;

class Person{
    protected Person(){
        System.out.println("Protected consotructor got called ");
    }
}

public class Employee extends Person {
    public Employee(){
        super();
        System.out.println("THe employee got called ");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        // e.Employee();
    }
    
    
}
