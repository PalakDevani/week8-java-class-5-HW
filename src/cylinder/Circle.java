package cylinder;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        if (radius < 0) {
            return radius; //this.radius = 0;
        } else {  //this.radius = radius;
            return radius;
        }


    }

    public double getArea() {
        double area = (Math.PI * radius * radius);
        return area;
    }
}

