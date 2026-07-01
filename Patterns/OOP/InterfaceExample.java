package OOP;
interface Vehicle {

    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car Starts");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
    }
}