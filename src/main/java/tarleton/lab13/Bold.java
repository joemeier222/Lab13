package tarleton.lab13;

/**
 *
 * @author Joe Meier
 */
public class Bold extends Decorator{

    public Bold(Font font) {
        super(font);
    }

    @Override
    public void print() {
        font.print();
        System.out.printf(", bold");
    }

    @Override
    public Integer size() {
        return null;
    }
    
    
}
