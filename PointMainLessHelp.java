import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;
// A program that deals with 2D points.
// Fifth version, to accompany immutable Point class.

public class PointMainLessHelp {
    public static void main(String[] args) {
        // create two Point objects
        Scanner askUser = new Scanner(System.in);
        ArrayList<Point> userPoints = new ArrayList<Point>();
        
        System.out.println("Choose any X value");
        int userCoordinates = askUser.nextInt();
        userPoints.add(0, userCoordinates);
        System.out.println("Choose any Y value");
        userCoordinates = askUser.nextInt();
        userPoints.add(1, userCoordinates);
        System.out.println("Choose another X value");
        userCoordinates = askUser.nextInt();
        userPoints.add(2, userCoordinates);
        System.out.println("Choose another Y value");
        userCoordinates = askUser.nextInt();
        userPoints.add(3, userCoordinates);
        
        Point p1 = new Point(userPoints.get(0), userPoints.get(1));
        Point p2 = new Point(userPoints.get(2), userPoints.get(3));

        // print each point and its distance from origin
        System.out.println("p1 is " + p1);
        System.out.println("p1 distance from origin = " + 
                           p1.distanceFromOrigin());

        System.out.println("p2 is " + p2);
        System.out.println("p2 distance from origin = " + 
                           p2.distanceFromOrigin());

        // translate each point to a new location
        p1 = p1.translate(-4, 1);
        p2 = p2.translate(4, 1);

        // print the points again
        System.out.println("p1 translated is now " + p1);
        System.out.println("p2 translated is now " + p2);
    }
}
