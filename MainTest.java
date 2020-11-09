import org.junit.Test;
import static org.junit.Assert.*; 

public class MainTest {
  @Test public void testNothing(){}
 
  @Test public void testSomeStuff(){
    assertEquals("Those numbers are not the same my dude", 5, 2+3);

    String test = new String();
    assertNotNull("is null xd", test);
    
    assertTrue("Argument is NOT smaller than condition", (3*7)>(4*5));
  } 
}