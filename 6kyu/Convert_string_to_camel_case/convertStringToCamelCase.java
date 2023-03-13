import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
      String input = "the_Stealth_Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
      String input = "the-Stealth-Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
}

class Solution{
  static String toCamelCase(String s){
        char[] array = s.toCharArray();

        String input = "";
        for (int i = 0; i < array.length; i++)  {
            if (array[i] == '-' || array[i] == '_') {
                if (array[i + 1] >= 97 && array[i + 1] <= 122) {
                    array[i + 1] -= 32;
                }
            }
            input += array[i];
        }

        String[] finalArr = input.contains("-") ? input.split("-") : input.split("_");

        input = "";
        for (int i = 0; i < finalArr.length; i++)   {
            input += finalArr[i];
        }

        return input;
    }
}
