package tarleton.lab13;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Joe Meier
 */
public class FontTest {
    private final PrintStream sout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(out));  
    }
    
    @AfterEach
    public void tearDown() {
        System.setOut(sout);
    }

    @Test
    public void test1() {
        Font font = new Calibri(8);
        font.print();
        assertEquals("Calibri, 8", out.toString());
    }

    @Test
    public void test2() {
        Font font = new Garamond(12);
        font.print();
        assertEquals("Garamond, 12", out.toString());
    }
    
    @Test
    public void test3() {
        Font font = new Italic(new Calibri(10));
        font.print();
        assertEquals("Calibri, 10, italic", out.toString());
    }
    
    @Test
    public void test4() {
        Font font = new Bold(new Garamond(14));
        font.print();
        assertEquals("Garamond, 14, bold", out.toString());
    }
    
    @Test
    public void test5() {
        Font font = new Underline(new Bold(new Calibri(11)));
        font.print();
        assertEquals("Calibri, 11, bold, underline", out.toString());
    }
    
    @Test
    public void test6() {
        Font font = new Strikethrough(new Italic(new Garamond(18)));
        font.print();
        assertEquals("Garamond, 18, italic, strikethrough", out.toString());
    }
    
    @Test
    public void test7() {
        Font font = new Strikethrough(new Underline(new Italic(new Bold(new Calibri(24)))));
        font.print();
        assertEquals("Calibri, 24, bold, italic, underline, strikethrough", out.toString());
    }
    
    @Test
    public void test8() {
        Font font = new Underline(new Strikethrough(new Bold(new Italic(new Garamond(32)))));
        font.print();
        assertEquals("Garamond, 32, italic, bold, strikethrough, underline", out.toString());
    }
}
