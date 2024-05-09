import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its Area or Volume:");
        System.out.println("\t1. Rectangle");
        System.out.println("\t2. Square");
        System.out.println("\t3. Circle");
        System.out.println("\t4. Triangle");
		System.out.println("\t5. Sphere");
		System.out.println("\t6. Cube");
        System.out.print("Enter your choice (1/2/3/4/5/6): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateRectangleArea(scanner);
                break;
            case 2:
                calculateSquareArea(scanner);
                break;
            case 3:
                calculateCircleArea(scanner);
                break;
            case 4:
                calculateTriangleArea(scanner);
                break;
			case 5:
                calculateSphereVolume(scanner);
                break;
			case 6:
                calculateCubeVolume(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    private static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Area of the rectangle: " + area + "m^2");
    }

    private static void calculateSquareArea(Scanner scanner) {
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double area = side * side;
        System.out.println("Area of the square: " + area + "m^2");
    }

    private static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area + "m^2");
    }
	
	 private static void calculateTriangleArea(Scanner scanner) {
        System.out.print("Enter the base length of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area + "m^2");
    }
	
	 private static void calculateSphereVolume(Scanner scanner) {
        System.out.print("Enter the radius of the Sphere: ");
        double radius = scanner.nextDouble();
        double volume = Math.PI * 4/3 * radius * radius * radius;
        System.out.println("Volume of the Sphere: " + volume + "m^3");
    }


	private static void calculateCubeVolume(Scanner scanner) {
			System.out.print("Enter the radius of the Cube: ");
			double side = scanner.nextDouble();
			double volume = side * side * side;
			System.out.println("Volume of the Cube: " + volume + "m^3");
		}
		
   
}