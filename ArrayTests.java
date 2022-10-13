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
	public void testReverseInPlace1() {
    int[] input2={3,4,5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 5,4,3 }, input2);
  }
  


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed1() {
    int[] input2 = { 3,4};
    assertArrayEquals(new int[]{ 4,3}, ArrayExamples.reversed(input2));
  }
  @Test
  public void AveragewithLowestTest() {
    double[] input2 = {11.5,11.5,11.5,11.5};
    double output=ArrayExamples.averageWithoutLowest(input2);
    assertEquals(11.5 , output);
  }
}
