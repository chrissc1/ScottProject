import java.util.Scanner;

public class LinearEquationLogic {
    private int xCord1;
    private int xCord2;
    private int yCord1;
    private int yCord2;

    Scanner scan = new Scanner(System.in);

    public LinearEquationLogic() {
    }

    public void start() {
    }

    public void coordinates() {
        System.out.println("Enter The first X value: ");
        xCord1 = scan.nextInt();
        System.out.println("Enter The first Y value: ");
        yCord1 = scan.nextInt();
        System.out.println("Enter The second X value: ");
        xCord2 = scan.nextInt();
        System.out.println("Enter The second Y value: ");
        yCord2 = scan.nextInt();
        LinearEquation eq = new LinearEquation(xCord1, yCord1, xCord2, yCord2);
        System.out.println("The two point are:" + "(" + xCord1 + ", " + yCord1 + ")" + "and" + "(" + xCord2 + ", " + yCord2 + ")");
    }
    public void equation() {
        int top = yCord2 - yCord1;
        int bottom = xCord2 - xCord1;
        double slopeInt = yCord2 - ((top / bottom) * xCord2);
        if ((yCord2 - yCord1) % (xCord2 - xCord1) != 0) {
            String slope = top + "/" + bottom;
            System.out.println("The equation of the line between these points is: y = " + slope + " + " + slopeInt );
        } else {
            int slope = top / bottom;
            System.out.println("The equation of the line between these points is: y = " + slope + " + " + slopeInt );
        }
    }

    public void slope() {
        double slope = (double) (yCord2 - yCord1) / (xCord2 - xCord1);
        System.out.println("The slope of this line is: " + slope);
    }


}
