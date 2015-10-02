package ejercicios.java.toni;

/**
 * Created by toni on 28/09/15.
 */
public abstract class AbstractShape implements Shape{
    private String type;

    public AbstractShape(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "I'm a " + type;
    }
}
