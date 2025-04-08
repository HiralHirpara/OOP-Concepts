package Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Create an object of type 'Car'
        Car car = new Car();

        // Set values using setters
        car.setName("Tesla");
        car.setModel("Cybertruck");
        car.setColor("Mat blue");

        // Call the method 'drive' on the object
        car.drive(); // Output: The Mat blue Tesla Cybertruck is driving.

        /* Output:
        Car Name: Tesla
        Car Model: Cybertruck
        Car color: Mat blue
         */
        System.out.println("Car Name: " + car.getName());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car color: " + car.getColor());
    }
}
