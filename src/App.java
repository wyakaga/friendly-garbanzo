import java.util.Scanner;
import abstraction.shape.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("1. Square");
            System.out.println();
            System.out.print("2. Rectangle");
            System.out.println();
            System.out.print("3. Triangle");
            System.out.println();

            System.out.print("Choose shape: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("=== Square ===");
                    System.out.print("Input square side: ");
                    Float sides = Float.valueOf(scanner.nextLine());
                    Square square = new Square(sides);
                    System.out.println();
                    square.drawShape();
                    System.out.println();
                    System.out.println("Sides: " + square.getSides());
                    System.out.println("Perimeter: " + square.calcPerimeter());
                    System.out.println("Area: " + square.calcArea());
                    break;

                case "2":
                    System.out.println("=== Rectangle ===");
                    System.out.print("Input rectangle length: ");
                    Float length = Float.valueOf(scanner.nextLine());
                    System.out.print("Input rectangle width: ");
                    Float width = Float.valueOf(scanner.nextLine());
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println();
                    rectangle.drawShape();
                    System.out.println();
                    System.out.println("Length: " + rectangle.getLength());
                    System.out.println("Width: " + rectangle.getWidth());
                    System.out.println("Perimeter: " + rectangle.calcPerimeter());
                    System.out.println("Area: " + rectangle.calcArea());
                    break;

                case "3":
                    System.out.println("=== Triangle ===");
                    System.out.print("Input first side: ");
                    Float side1 = Float.valueOf(scanner.nextLine());
                    System.out.print("Input second side: ");
                    Float side2 = Float.valueOf(scanner.nextLine());
                    System.out.print("Input third side: ");
                    Float side3 = Float.valueOf(scanner.nextLine());
                    Triangle triangle = new Triangle(side1, side2, side3);
                    System.out.println();
                    triangle.drawShape();
                    System.out.println();
                    System.out.println("First side: " + triangle.getSide1());
                    System.out.println("Second side: " + triangle.getSide2());
                    System.out.println("Third side: " + triangle.getSide3());
                    System.out.println("Perimeter: " + triangle.calcPerimeter());
                    System.out.println("Area: " + triangle.calcArea());
                    break;

                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
