package tarleton.lab13;

/**
 *
 * @author Joe Meier
 */
public class Garamond implements Font{

    private final Integer sz;

    public Garamond(Integer sz) {
        this.sz = sz;
    }

    @Override
    public void print() {
        System.out.printf("Garamond, " + size());
    }

    @Override
    public Integer size() {
        return sz;
    }
        
}
