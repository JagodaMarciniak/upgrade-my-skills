package pl.coderstrust.figures;

public class Triangle implements Figure {
    private double height;
    private double base;
    private double area;

    public Triangle() {
    }

    public Triangle(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("The 'height' parameter must be higher than 0");
        }
        this.height = height;
    }

    public Triangle(double height, double base) {
        if (height <= 0) {
            throw new IllegalArgumentException("The 'height' parameter must be higher that 0");
        } else if (base <= 0) {
            throw new IllegalArgumentException("The 'base' parameter must be higher that 0");
        }
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("You can't set 'height' parameter lower than 0 or equal to 0");
        }
        this.height = height;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("You can't set 'base' parameter lower than 0 or equal to 0");
        }
        this.base = base;
    }

    public void setArea(double area) {
        if (base <= 0) {
            throw new IllegalArgumentException("You can't set 'area' parameter lower than 0 or equal to 0");
        }
        this.area = area;
    }
}
