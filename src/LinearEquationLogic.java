import java.util.Scanner;

public class LinearEquationLogic {
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the Linear Equation Calculator!");

        while (true) {
            int x1, y1, x2, y2;

            // Get coordinates from the user.
            System.out.print("Enter the first X value: ");
            x1 = scanner.nextInt();
            System.out.print("Enter the first Y value: ");
            y1 = scanner.nextInt();
            System.out.print("Enter the second X value: ");
            x2 = scanner.nextInt();
            System.out.print("Enter the second Y value: ");
            y2 = scanner.nextInt();

            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);

            // Display line information.
            System.out.println("The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")");
            System.out.println("The equation of the line between these points is: " + equation.equation());
            System.out.println("The slope of this line is: " + equation.slope());
            System.out.println("The y-intercept of this line is: " + equation.yIntercept());
            System.out.println("The distance between these points is: " + equation.distance());

            // Ask the user if they want to find a coordinate for a specific x value.
            System.out.print("Enter an x value : ");
            double input = scanner.nextInt();
            String coordinate = equation.coordinateForX(input);
            System.out.println("Coordinate for x = " + input + ": " + coordinate);
            System.out.println("Do you want to put in 2 more coordinates? y/n");
            String meep = scanner.nextLine();

            if (meep.equals("n")) {
                System.out.println("Bye Bye!");
            } else if (meep.equals("y")) {
                start();
            } else {
                System.out.println("Invalid answer!");
            }
        }
    }

    public static void main(String[] args) {
        LinearEquationLogic logic = new LinearEquationLogic();
        logic.start();
    }
}
