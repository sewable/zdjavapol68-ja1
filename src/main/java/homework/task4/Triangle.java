package homework.task4;

public class Triangle extends Shape{

    protected Triangle(Point p1, Point p2, Point p3) {
        super(new Point[]{
                p1,
                p2,
                p3
        });
    }

    @Override
    public double area() {
        double lengthA = Math.sqrt(Math.pow(points[0].getX() - points[1].getX(), 2) + Math.pow(points[0].getY() - points[1].getY(), 2));
        double lengthB = Math.sqrt(Math.pow(points[1].getX() - points[2].getX(), 2) + Math.pow(points[1].getY() - points[2].getY(), 2));
        double lengthC = Math.sqrt(Math.pow(points[0].getX() - points[2].getX(), 2) + Math.pow(points[0].getY() - points[2].getY(), 2));

        double p = (lengthA + lengthB + lengthC) / 2;
        return Math.sqrt(p * (p - lengthA) * (p - lengthB) * (p - lengthC));
    }
}
