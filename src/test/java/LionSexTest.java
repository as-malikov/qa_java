import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;

import static Constants.AnimalsConstants.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionSexTest {

    @Mock
    Feline feline;
    private Lion lion;
    private String sex;
    private boolean hasMane;

    public LionSexTest(String sex, boolean hasMane) {
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
        lion = new Lion(feline, sex);
        assertEquals(hasMane, lion.doesHaveMane());
    }
}
