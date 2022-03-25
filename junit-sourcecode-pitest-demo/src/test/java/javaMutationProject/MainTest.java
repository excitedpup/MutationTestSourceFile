package javaMutationProject;
import static org.junit.Assert.*;

import org.junit.Test;

import javaMutationProject.MySourceCode;

public class MainTest {

    @Test
    public void testStuff() {
    	MySourceCode c = new MySourceCode();
    	c.count(11);
    	c.count(9);
    	c.count(10);
    }

    @Test
    public void shouldStartWithEmptyCount() {
    	MySourceCode testee1 = new MySourceCode();
        assertEquals(0,testee1.currentCount());
    }

    @Test
    public void shouldCountIntegersAboveTen() {
    	MySourceCode testee2 = new MySourceCode();
        testee2.count(11);
        assertEquals(1,testee2.currentCount());
    }

    @Test
    public void shouldNotCountIntegersBelowTen() {
    	MySourceCode testee3 = new MySourceCode();
        testee3.count(9);
        assertEquals(0,testee3.currentCount());
    }
}
