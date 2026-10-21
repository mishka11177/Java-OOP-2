package ge.tbc.testautomation.figures;

public class Triangle extends Figure {
    private double a, b, c, h;

    @Override
    public double getArea() {
        return a * h / 2;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
