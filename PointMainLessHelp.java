// A program that deals with 2D points.
// Fifth version, to accompany immutable Point class.

public class PointMainLessHelp {
    public static void main(String[] args) {
        // create two Point objects
        ArrayList<Integer> myPoints = new ArrayList<Integer>();
        Point p1 = new Point(12, 4);
        Point p2 = new Point(0, 5);

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
