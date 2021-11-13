package tarleton.lab13;

/**
 *
 * @author Joe Meier
 */
public class Strikethrough extends Decorator{

    public Strikethrough(Font font) {
        super(font);
    }

    @Override
    public void print() {
        font.print();
        System.out.printf(", strikethrough");
    }

    @Override
    public Integer size() {
        return null;
    }
    
    
}