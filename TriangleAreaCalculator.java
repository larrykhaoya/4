import java.util.Scanner;

public class TriangleAreaCalculator {

    private double base;
    private double height;

    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();

        calculator.readDimensions();
        double area = calculator.computeArea();
        calculator.displayArea(area);
    }

    public void readDimensions() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the base of the triangle: ");
        base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle: ");
        height = scanner.nextDouble();
    }

    public double computeArea() {
        return (base * height) / 2;
    }

    public void displayArea(double area) {
        System.out.println("The area of the triangle is: " + area);
    }
}