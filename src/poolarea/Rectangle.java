package poolarea;

public class Rectangle {

    double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        if (width < 0) {
            return this.width = 0;
        } else {
            return this.width;
        }
    }

    public double getLength() {
        if (length < 0) {
            return this.length = 0;
        } else {
            return this.length;
        }
    }

    public double getArea() {
        double area = (width * length);
        return area;
    }
}


