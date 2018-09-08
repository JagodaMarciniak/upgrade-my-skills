package pl.coderstrust.figures;

public class Trapezoid implements Figure {
    private double height;
    private double a;
    private double b;
    private double area;

    public Trapezoid(double height, double a, double b) {
        if (height <= 0) {
            throw new IllegalArgumentException("The 'height' parameter must be higher that 0");
        } else if (a <= 0) {
            throw new IllegalArgumentException("The 'a' parameter must be higher that 0");
        } else if (b <= 0) {
            throw new IllegalArgumentException("The 'b' parameter must be higher that 0");
        } else
            this.height = height;
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return height * (a + b) / 2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("You can't set 'height' parameter lower or equal to 0");
        }
        this.height = height;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("You can't set 'a' parameter lower or equal to 0");
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b <= 0) {
            throw new IllegalArgumentException("You can't set 'b' parameter lower or equal to 0");
        }
        this.b = b;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("You can't set 'area' parameter lower or equal to 0");
        }
        this.area = area;
    }
}
