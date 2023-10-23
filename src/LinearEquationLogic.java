import java.util.Scanner;

public class LinearEquationLogic {
    private String coordinate1;
    private String coordinate2;

    Scanner scan = new Scanner(System.in);

    public LinearEquationLogic() {
        coordinate1 = null;
        coordinate2 = null;
    }

    public void start() {
        getCoordinates();
    }

    public void getCoordinates() {
        System.out.println("Enter The first X value: ");
        int xCord1 = scan.nextInt();
        System.out.println("Enter The first Y value: ");
        int yCord1 = scan.nextInt();
        System.out.println("Enter The second X value: ");
        int xCord2 = scan.nextInt();
        System.out.println("Enter The second Y value: ");
        int yCord2 = scan.nextInt();
        LinearEquation eq = new LinearEquation(xCord1, yCord1, xCord2, yCord2);
        System.out.println("The two point are:" + "(" + xCord1 + ", " + yCord1 + ")" + "and" + "(" + xCord2 + ", " + yCord2 + ")");
    }



}
