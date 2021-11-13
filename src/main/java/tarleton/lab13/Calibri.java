package tarleton.lab13;

/**
 *
 * @author joeme
 */
public class Calibri implements Font{

    private final Integer sz;

    public Calibri(Integer sz) {
        this.sz = sz;
    }

    @Override
    public void print() {
        System.out.printf("Calibri, " + size());
    }

    @Override
    public Integer size() {
        return sz;
    }
    
}
