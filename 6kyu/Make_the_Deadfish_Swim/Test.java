import static org.junit.Assert.*;

public class ExampleTests {
    @org.junit.Test
    public void exampleTests() {
        assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
        asseryArrayEquals(new int[] {2, 4}, DeadFish.parse("ii"));
    }
}
