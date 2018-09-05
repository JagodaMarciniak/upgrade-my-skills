package pl.coderstrust.figures;

public class Trapezoid implements Area {
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
        this.area = height * (a + b) / 2;
    }

    @Override
    public double calculateArea() {
        return this.area;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("You can't set 'height' parameter lower or equal to 0");
        } else
            this.height = height;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("You can't set 'a' parameter lower or equal to 0");
        } else
            this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b <= 0) {
            throw new IllegalArgumentException("You can't set 'b' parameter lower or equal to 0");
        } else
            this.b = b;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("You can't set 'area' parameter lower or equal to 0");
        } else
            this.area = area;
    }
}
