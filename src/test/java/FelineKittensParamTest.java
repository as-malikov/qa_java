import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineKittensParamTest {

    private final int argKittensCount;
    private final int expectedKittensCount;

    public FelineKittensParamTest(int argKittensCount, int expectedKittensCount) {
        this.argKittensCount = argKittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {10, 10},
                {99, 99},
                {100, 100}
        };
    }

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens(argKittensCount);
        assertEquals(expectedKittensCount, actualKittensCount);
    }
}
