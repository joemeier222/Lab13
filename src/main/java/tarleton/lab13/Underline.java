package tarleton.lab13;

/**
 *
 * @author Joe Meier
 */
public class Underline extends Decorator{

    public Underline(Font font) {
        super(font);
    }

    @Override
    public void print() {
        font.print();
        System.out.printf(", underline");
    }

    @Override
    public Integer size() {
        return null;
    }
    
    
}