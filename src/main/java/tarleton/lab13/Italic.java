package tarleton.lab13;

/**
 *
 * @author Joe Meier
 */
public class Italic extends Decorator{

    public Italic(Font font) {
        super(font);
    }

    @Override
    public void print() {
        font.print();
        System.out.printf(", italic");
    }

    @Override
    public Integer size() {
        return null;
    }
    
    
}