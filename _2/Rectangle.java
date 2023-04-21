package _2;

public class Rectangle extends Shape{
    public Rectangle(double field, double width) {
        super(field, width);
    }

    @Override
    double calculateArea() {
        return getField() * getWidth();
    }

}
