// package Protected;

class person{
    protected person(){
        System.out.println("Protected consotructor got called ");
    }
}

public class Employee extends person {
    public Employee(){
        super();
        System.out.println("THe employee got called ");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        // e.Employee();
    }
    
    
}
