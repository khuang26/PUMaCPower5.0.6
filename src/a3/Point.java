package a3;

public class Point {
    double coordX;
    double coordY;
    double[] location = new double[2];

    public Point(double[] location) {
        this.location = location;
        this.coordX = location[0];
        this.coordY = location[1];
    }
}
