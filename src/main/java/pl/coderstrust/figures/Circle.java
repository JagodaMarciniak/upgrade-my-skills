package pl.coderstrust.figures;

public class Circle implements Area {
    private double radius;
    final double pi = Math.PI;
    private double area;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("The 'radius' parameter must be higher that 0");
        } else
            this.radius = radius;
        this.area = pi * radius * radius;
    }

    @Override
    public double calculateArea() {
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("You can't set 'radius' parameter lower or equal that 0");
        } else
            this.radius = radius;
    }
}
