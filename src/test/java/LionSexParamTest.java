import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static Constants.AnimalsConstants.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionSexParamTest {

    private final String sex;
    private final boolean hasMane;
    @Mock
    Feline feline;

    public LionSexParamTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getQuestionAnswer() {
        return new Object[][]{
                {MALE, true},
                {FEMALE, false}
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        assertEquals(hasMane, lion.doesHaveMane());
    }
}
