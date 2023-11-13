import java.util.Scanner;

public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance() {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        double dist = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return roundedToHundredth(dist);
    }

    public double yIntercept() {
        return roundedToHundredth(y2 - slope() * x2);
    }

    public double slope() {
        if (x1 == x2) {
            return Double.POSITIVE_INFINITY;
        }
        return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
    }

    public String equation() {
        if (x1 == x2) {
            // Handle the case where the two points form a vertical line.
            return "x = " + x1;
        } else if (y1 == y2) {
            // Handle the case where the two points form a horizontal line.
            return "y = " + y1;
        } else {
            return "y = " + slope() + "x + " + yIntercept();
        }
    }

    public String coordinateForX(double x) {
        if (x1 == x2) {
            // Handle the case where the two points form a vertical line.
            if (x == x1) {
                return "(" + x1 + ", " + Math.min(y1, y2) + ")";
            } else {
                return "No valid point exists for x = " + x;
            }
        } else {
            double y = slope() * x + yIntercept();
            return "(" + roundedToHundredth(x) + ", " + roundedToHundredth(y) + ")";
        }
    }

    public String lineInfo() {
        String info = "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n" +
                "The equation of the line between these points is: " + equation() + "\n" +
                "The slope of this line is: " + slope() + "\n" +
                "The y-intercept of this line is: " + yIntercept() + "\n" +
                "The distance between these points is " + distance();
        return info;
    }

    private double roundedToHundredth(double round) {
        return Math.round(round * 100.0) / 100.0;
    }
}
