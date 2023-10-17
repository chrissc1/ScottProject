import java.util.Scanner;

public class LinearEquationLogic {
    private LinearEquation coordinate1;
    private LinearEquation coordinate2;

    private Scanner scan;

    public LinearEquationLogic() {
        coordinate1 = null;
        coordinate2 = null;
        scan = new Scanner(System.in);
    }

    public void start() {
        getCoordinates();
    }

    public void getCoordinates() {
        System.out.println("Enter Coordinate 1: ");
        int coordinate1 = scan.nextInt();


    }



}
