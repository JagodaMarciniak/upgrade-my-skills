package pl.coderstrust.figures;

public class Triangle implements Figure {
    private double height;
    private double a;
    private double area;

    public Triangle(double height, double a) {
        if (height <= 0) {
            throw new IllegalArgumentException("The 'height' parameter must be higher that 0");
        } else if (a <= 0) {
            throw new IllegalArgumentException("The 'a' parameter must be higher that 0");
        }
        this.height = height;
        this.a = a;

    }

    @Override
    public double calculateArea() {
        return a * height / 2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("You can't set 'height' parameter lower than 0 or equal to 0");
        }
        this.height = height;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("You can't set 'a' parameter lower than 0 or equal to 0");
        }
        this.a = a;

    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (a <= 0) {
            throw new IllegalArgumentException("You can't set 'area' parameter lower than 0 or equal to 0");
        }
        this.area = area;

    }
}
