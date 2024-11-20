package a3;

public class Triangle {
    static int numTriangles = 0;
    int size;
    double coordX;
    double coordY;
    Point[] corners = new Point[3];


    public Triangle(int size, double coordX, double coordY){
        this.size = size;
        this.coordX = coordX;
        this.coordY = coordY;
        double[] pLeftLoc = new double[2];
        pLeftLoc[0] = coordX;
        pLeftLoc[1] = coordY;
        Point pLeft = new Point(pLeftLoc);
        corners[0] = pLeft;

        double[] pRightLoc = new double[2];
        pRightLoc[0] = coordX + 1/(Math.pow(2, size));
        pRightLoc[1] = coordY;
        Point pRight = new Point(pRightLoc);
        corners[1] = pRight;

        double[] pTopLoc = new double[2];
        pTopLoc[0] = coordX + (double) 1/2 * 1/(Math.pow(2, size));
        pTopLoc[1] = coordY + Math.sqrt(3)/2 * 1/(Math.pow(2, size));
        Point pTop = new Point(pTopLoc);
        corners[2] = pTop;

        numTriangles += 1;

    }


}
