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
  public void testReversedSequence() {
    int[] input2 = {3, 4, 5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 5,4,3}, input2);
  }

  @Test
  public void testReversedSequence2() {
    int[] input3 = {3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3}, ArrayExamples.reversed(input3));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input3 = {5.0, 5.0, 5.0, 10.0, 10.0};
    assertEquals(20.0, ArrayExamples.averageWithoutLowest(input3), 0.001);
  }
}
