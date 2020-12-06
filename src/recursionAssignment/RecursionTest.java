package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;

import recursionAssignment.Recursion;

public class RecursionTest {

    @Before
    public void SomeBeforeProcedures(){
      // code for your @After method
    }

    @After
    public void SomeAfterProcedures(){
      // code for your @After method
    }
    
    /**
     * An initial test
     */
    @Test
    public void Test1(){
      assertEquals(Recursion.count7(717), 2);
    }

    @Test
    public void Test2(){
    assertEquals(Recursion.count7(7), 1);
    }

    @Test
    public void Test3(){
    assertEquals(Recursion.count7(123), 0);
    }

    @Test
    public void Test4(){
    assertEquals(Recursion.count7(75854773), 3);
    }

    @Test
    public void Test5(){
    assertEquals(Recursion.count7(-1), 0);
    }

    @Test
    public void Test6(){
    assertEquals(Recursion.count7(0), 0);
    }

    @Test
    public void Test7(){
    assertEquals("", Recursion.changePi(""));
    }

    @Test
    public void Test8(){
    assertEquals("x3.14x", Recursion.changePi("xpix"));
    }
}
