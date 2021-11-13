package tarleton.lab13;

/**
 *
 * @author Joe Meier
 */
public abstract class Decorator implements Font{
    protected final Font font;

    public Decorator(Font font) {
        this.font = font;
    }
}
