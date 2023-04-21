package _2;

public class Circle extends Shape{
    public Circle(double field, double width) {
        super(field, width);
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow((getField() / 2), 2);
    }
}
