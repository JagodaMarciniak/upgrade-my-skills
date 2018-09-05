package pl.coderstrust.figures;

public interface area {
    double calculateArea(double x, double y);
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6, 3.14);
        System.out.println(circle.calculateArea(6, 3.14));
    }
}

class Rectangle implements area {
    public double calculateArea(double x, double y) {
        return x * y;
    }
}

class Circle implements area {
    private double pi;
    double x;

    public Circle(double x, double pi) {
        this.pi = pi;
        this.x = x;
    }

    public double calculateArea(double x, double pi) {
        this.pi = pi;
        return pi * x * x;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}

class Triangle implements area {
    public double calculateArea(double x, double hight) {
        return x * hight / 2;
    }

//    class Trapezoid implements area {
//        public double calculateArea(double x, double y, double hight) {
//            return (x + y) / 2 * hight;
//        }
}