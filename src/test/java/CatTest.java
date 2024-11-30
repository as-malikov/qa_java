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
        String expectedMeow = "Мяу";
        String actualMeow = cat.getSound();
        assertEquals(expectedMeow, actualMeow);
    }

    @Test
    public void getFoodReturnCorrectEatMeat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeatList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualEatMeatList = cat.getFood();
        assertEquals(expectedEatMeatList, actualEatMeatList);
    }

}
