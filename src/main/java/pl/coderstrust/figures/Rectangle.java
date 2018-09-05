package pl.coderstrust.figures;

public class Rectangle implements Area {

    private double width, height, area;

    public Rectangle(double width, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("The 'height' parameter must be higher that 0");
        } else if (width <= 0) {
            throw new IllegalArgumentException("The 'width' parameter must be higher that 0");
        } else
            this.width = width;
        this.height = height;
        this.area = width * height;
    }

    public Rectangle(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("The 'width' parameter must be higher that 0");
        } else
            this.width = width;
        this.area = width * width;
    }

    @Override
    public double calculateArea() {
        return area;
    }

    public double getArea() {
        return area;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("You can't set 'width' parameter lower then 0 or equal to 0");
        } else
            this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("You can't set 'height' parameter lower then 0 or equal to 0");
        } else
            this.height = height;
    }

    public void setArea(double area) {
        if (area <= 0) {
            throw new IllegalArgumentException("You can't set 'area' parameter lower then 0 or equal to 0");
        } else
            this.area = area;
    }
}
