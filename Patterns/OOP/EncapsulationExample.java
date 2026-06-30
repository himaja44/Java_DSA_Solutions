package OOP;

public class EncapsulationExample {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        EncapsulationExample obj = new EncapsulationExample();

        obj.setName("Himaja");

        System.out.println(obj.getName());
    }
}