package pl.coderstrust.figures;

public class Square implements Figure {
    private double side;

    public Square() {
    }

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("The 'side' parameter must be higher that 0");
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("You can't set 'side' parameter lower then 0 or equal to 0");
        }
        this.side = side;
    }
}
