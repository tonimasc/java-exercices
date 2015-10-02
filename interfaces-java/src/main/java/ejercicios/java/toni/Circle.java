package ejercicios.java.toni;

/**
 * Created by toni on 28/09/15.
 */
public class Circle extends AbstractShape {
    private double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
