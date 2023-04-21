import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2()
  {
    int[] input1 = { 3, 6, 9 , 12 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 12,9, 6, 3 }, input1);
  }

  @Test
  public void testReversed2()
  {

  }
}
