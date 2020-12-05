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
      assertEquals(Recursion.count7(717), 717);
      // initial failing test (red)
    }

    // green: adding method (count7) to Recursion.java to make the test pass

    @Test
    public void Test2(){
    assertEquals(Recursion.count7(7), 1);
    // refactor
    }

    @Test
    public void Test3(){
    assertEquals(Recursion.count7(123), 0);
    // red state 2
    }
}
