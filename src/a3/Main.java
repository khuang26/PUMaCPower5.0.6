package a3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int size = 3;
        Triangle t1 = new Triangle(size, (double) 0 /8,0);
        Triangle t2 = new Triangle(size, (double) 1 /8,0);
        Triangle t3 = new Triangle(size, (double) 2 /8,0);
        Triangle t4 = new Triangle(size, (double) 3 /8,0);
        Triangle t5 = new Triangle(size, (double) 4 /8,0);
        Triangle t6 = new Triangle(size, (double) 5 /8,0);
        Triangle t7 = new Triangle(size, (double) 6 /8,0);
        Triangle t8 = new Triangle(size, (double) 7 /8,0);
        Triangle t9 = new Triangle(size, (double) 0.5 /8,Math.sqrt(3)/16);
        Triangle t10 = new Triangle(size, (double) 2.5 /8,Math.sqrt(3)/16);
        Triangle t11 = new Triangle(size, (double) 4.5 /8,Math.sqrt(3)/16);
        Triangle t12 = new Triangle(size, (double) 6.5 /8,Math.sqrt(3)/16);
        Triangle t13 = new Triangle(size, (double) 1 /8,2 * Math.sqrt(3)/16);
        Triangle t14 = new Triangle(size, (double) 2 /8,2 * Math.sqrt(3)/16);
        Triangle t15 = new Triangle(size, (double) 5 /8,2 * Math.sqrt(3)/16);
        Triangle t16 = new Triangle(size, (double) 6 /8,2 * Math.sqrt(3)/16);
        Triangle t17 = new Triangle(size, (double) 1.5 /8,3 * Math.sqrt(3)/16);
        Triangle t18 = new Triangle(size, (double) 5.5 /8,3 * Math.sqrt(3)/16);
        Triangle t19 = new Triangle(size, (double) 2 /8,4 * Math.sqrt(3)/16);
        Triangle t20 = new Triangle(size, (double) 3 /8,4 * Math.sqrt(3)/16);
        Triangle t21 = new Triangle(size, (double) 4 /8,4 * Math.sqrt(3)/16);
        Triangle t22 = new Triangle(size, (double) 5 /8,4 * Math.sqrt(3)/16);
        Triangle t23 = new Triangle(size, (double) 2.5 /8,5 * Math.sqrt(3)/16);
        Triangle t24 = new Triangle(size, (double) 4.5 /8,5 * Math.sqrt(3)/16);
        Triangle t25 = new Triangle(size, (double) 3 /8,6 * Math.sqrt(3)/16);
        Triangle t26 = new Triangle(size, (double) 4 /8,6 * Math.sqrt(3)/16);
        Triangle t27 = new Triangle(size, (double) 3.5 /8,7 * Math.sqrt(3)/16);

        ArrayList<Triangle> triangles = new ArrayList<Triangle>(27);
        triangles.add(t1);
        triangles.add(t2);
        triangles.add(t3);
        triangles.add(t4);
        triangles.add(t5);
        triangles.add(t6);
        triangles.add(t7);
        triangles.add(t8);
        triangles.add(t9);
        triangles.add(t10);
        triangles.add(t11);
        triangles.add(t12);
        triangles.add(t13);
        triangles.add(t14);
        triangles.add(t15);
        triangles.add(t16);
        triangles.add(t17);
        triangles.add(t18);
        triangles.add(t19);
        triangles.add(t20);
        triangles.add(t21);
        triangles.add(t22);
        triangles.add(t23);
        triangles.add(t24);
        triangles.add(t25);
        triangles.add(t26);
        triangles.add(t27);

        System.out.println(triangles);


        double minRatio = 1;
        TriangleComparator triangleComparator = new TriangleComparator();


        ArrayList<Triangle> subset = new ArrayList<>();
        for (int i = 1; i < (1 << (int) Math.pow(size, 3)); i++) { // start at 1 to avoid empty set
            subset.clear();
            for (int j = 0; j < (int) Math.pow(size, 3); j++) {
                if ((i >> j) % 2 == 1) {
                    subset.add(triangles.get(j));
                }
            }
            triangleComparator.setTriangles(subset);
            if (triangleComparator.ratio() < minRatio) {
                minRatio = triangleComparator.ratio();
                System.out.println(subset);
                System.out.println(minRatio);
            }

        }

        System.out.println(minRatio);

    }
}
