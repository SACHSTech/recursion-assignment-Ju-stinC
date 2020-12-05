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
      // assertEquals(EXPECTEDVALUE, TESTVALUE);
      assertEquals(Recursion.count7(717), 717);
      // assertTrue(TESTBOOLEAN);
    }

    @Test
    public void Test2(){
    // assertEquals(EXPECTEDVALUE, TESTVALUE);
    assertEquals(Recursion.count7(7), 1);
    // assertTrue(TESTBOOLEAN);
    }
}
