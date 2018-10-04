package pl.coderstrust.figures;

public class Trapezoid implements Figure {
    private double height;
    private double sideA;
    private double sideB;
    private double area;

    public Trapezoid() {
    }

    public Trapezoid(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("The 'height' parameter must be higher than 0");
        }
        this.height = height;
    }

    public Trapezoid(double height, double sideA, double sideB) {
        if (height <= 0) {
            throw new IllegalArgumentException("The 'height' parameter must be higher that 0");
        } else if (sideA <= 0) {
            throw new IllegalArgumentException("The 'sideA' parameter must be higher that 0");
        } else if (sideB <= 0) {
            throw new IllegalArgumentException("The 'sideB' parameter must be higher that 0");
        } else
            this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return height * (sideA + sideB) / 2;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("You can't set 'height' parameter lower or equal to 0");
        }
        this.height = height;
    }

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("You can't set 'sideA' parameter lower or equal to 0");
        }
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("You can't set 'sideB' parameter lower or equal to 0");
        }
        this.sideB = sideB;
    }

    public void setArea(double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("You can't set 'area' parameter lower or equal to 0");
        }
        this.area = area;
    }
}
