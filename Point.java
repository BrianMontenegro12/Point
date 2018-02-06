// A Point object represents a pair of (x, y) coordinates.
// Seventh version: Immutable.
// Class invariant: x >= 0 && y >= 0.
import java.util.ArrayList;
import java.util.Scanner;
public class Point {
    private int x;
    private int y;

    // Constructs a new point at the origin, (0, 0).
    public Point() {
        this(0, 0); // calls Point(int, int) constructor
    }
    public void userX() {
    }

    // Constructs a new point with the given (x, y) location.
    // pre: x >= 0 && y >= 0
    public Point(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException();
        }

        this.x = x;
        this.y = y;
    }

    // Returns the distance between this Point and (0, 0).
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Returns whether o refers to a point with the same (x, y)
    // coordinates as this point.
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else {  // not a Point object
            return false;
        }
    }

    // Returns the x-coordinate of this point.
    public double getX() {
        return x;
    }

    // Returns the y-coordinate of this point.
    public double getY() {
        return y;
    }

    // Returns a String representation of this point.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Shifts this point's location by the given amount.
    // pre: x + dx >= 0 && y + dy >= 0
    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }
    public double slope(Point other) {
        if(this.x == other.x)
            throw new IllegalArgumentException();
            return ((double) (this.y - other.y)) / (this.x - other.x);
    }
    public boolean isCollinear(Point p1, Point p2) {
        if(this.x == p1.x || this.x == p2.x)
            return this.x == p1.x && this.x == p2.x;
            double slope1 = ((double) (this.y - p1.y)) / (this.x - p1.x);
            double slope2 = ((double) (this.y - p2.y)) / (this.x - p2.x);
                if(slope1 == slope2) 
                    return true;
            return false;
    }
}