package pl.coderstrust.figures;

public class Square implements Figure {
    private double a;

    public Square(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("The 'a' parameter must be higher that 0");
        }
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("You can't set 'a' parameter lower then 0 or equal to 0");
        }
        this.a = a;
    }
}
