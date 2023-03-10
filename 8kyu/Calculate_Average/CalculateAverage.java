import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, Kata.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, Kata.find_average(new int[]{1, 2, 3}), DELTA);
    }
}

public class Kata { 
  public static double find_average(int[] array){
      double sum = 0;
      for (int i = 0; i < array.length; i++)  {
        sum += array[i];
      }
    return sum / array.length;
  }
}
