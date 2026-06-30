package OOP;
class Parent {

    void display() {
        System.out.println("This is Parent Class");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("This is Child Class");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Child obj = new Child();

        obj.display();
    }
}