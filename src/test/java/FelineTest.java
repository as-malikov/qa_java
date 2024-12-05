import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static Constants.AnimalsConstants.*;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline;

    @Before
    public void initLion() throws Exception {
        feline = new Feline();
    }

    @Test
    public void eraMeatReturnCorrectListTest() throws Exception {
        List<String> actuaDisheslList = feline.eatMeat();
        assertEquals(EXPECTED_PREDATOR_DISHES_LIST, actuaDisheslList);
    }

    @Test
    public void getCatFamilyTest() throws Exception {
        String actualFamily = feline.getFamily();
        assertEquals(CAT_FAMILY, actualFamily);
    }

    @Test
    public void getKittensReturnOneKittenTest() throws Exception {
        int actualCountKittens = feline.getKittens();
        assertEquals(ONE_KITTENS, actualCountKittens);
    }
}
