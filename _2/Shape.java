package _2;

public abstract class Shape {

    private double field, width;

    public Shape (double field, double width){
        this.field = field;
        this.width = width;
    }

    public double getField() {
        return field;
    }
    public void setField(double field) {
        this.field = field;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    abstract double calculateArea();

}
