package pl.coderstrust.figures;

public class Circle implements Figure {
    private double radius;
    final double pi = Math.PI;

    public Circle() {
    }

    public Circle(double radius)  {
        if (radius <= 0) {
            throw new IllegalArgumentException("The 'radius' parameter must be higher that 0");
        }
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return pi * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("You can't set 'radius' parameter lower or equal that 0");
        }
        this.radius = radius;
    }
}
