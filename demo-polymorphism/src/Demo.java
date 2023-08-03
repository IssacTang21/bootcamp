import javax.management.ConstructorParameters;

public class Demo {
    public static void main(String[] args) {
        // Dynamic polymorphism (Run-time)
        Building building = new House(); //
        // Complie-time checks
        // building.getCapacity(); // compile error
        building.print(); // compile-time confirm you can call print() method
        // Run-time decide which print() is going to call
        // So, Building variable call House's print() method
        building.print2(); // i'm House

        // Static Polymorphism (compile-time)
        // method signature (method + parameter)
        // Constructor Signature
        House house = new House();
        house.print("hello");
        house.print();
        House house2 = new House(3.0d);
        house2.print("hello");
        house2.print();
        // House house3 = new House("String"); // Constructor not found
        // house2.print(3L); // method not found

        // downcast
        long l1 = Long.valueOf(1L); // Wrapper calss -> unbox
        Long l3 = 3L; // wrapper class -> auto-box

        long l2 =2; // upcasting
        int i2 = (int) 3L; // downcast


        // downcast : (run-time) polymorphism
        Object obj = new Container();
        if (obj instanceof Cube) { // false
            Cube cube = (Cube) obj; // downcast:Object ->Cube
            System.out.println("obj is istance of Cube");
        }

        Object obj2 = new Cube();
        if (obj2 instanceof Container){ // true
            Container container = (Container) obj2;
            System.out.println("obj2 is instance of Container");
        }

        Container obj3 = new Clone();
        Cube cube2 = (Cube) obj3; // java.lang.ClassCastException
        // runtime exception: Run-time polymorphism

        Number number = Integer.valueOf(3);
        Double d1 = (Double) number; //java.lang.ClassCastException

    }
}
