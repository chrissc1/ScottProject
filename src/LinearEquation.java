import java.util.Scanner;

public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private String coordinate1;
    private String coordinate2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        coordinate1 = "(" + x1 + ", " + y1 + ")";
        coordinate2 = "(" + x2 + ", " + y2 + ")";
    }
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public double slope() {
        return (double) (y2 - y1) / (x2 - x1);
    }

    public double yIntercept() {
        return y2 - (slope() * x2);
    }

    public void getEquationIntcpt() {
        String equation = "y = " + slope() + "x + " + yIntercept();

    }

    public void getEquation() {
        String equation = "y = " + slope() + "x";
    }
    public double getDistance() {
        int ySquared = y2 - y1;
        int xSquared = x2 - x1;
        double dst = Math.sqrt(xSquared - ySquared);
        return dst;
    }
}
