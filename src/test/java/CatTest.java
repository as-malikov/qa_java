import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static Constants.AnimalsConstants.EXPECTED_PREDATOR_DISHES_LIST;
import static Constants.AnimalsConstants.*;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    Cat cat;

    @Mock
    Feline feline;

    @Before
    public void initCat() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundMeow() {
        String actualMeow = cat.getSound();
        assertEquals(EXPECTED_MEOW, actualMeow);
    }

    @Test
    public void getFoodReturnCorrectEatMeat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(EXPECTED_PREDATOR_DISHES_LIST);
        List<String> actualGetFoodList = cat.getFood();
        assertEquals(EXPECTED_PREDATOR_DISHES_LIST, actualGetFoodList);
    }

}
