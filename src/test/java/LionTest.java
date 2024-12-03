import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static Constants.AnimalsConstants.*;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;
    private Lion lion;

    @Before
    public void initLion() throws Exception {
        lion = new Lion(feline, MALE);
    }

    @Test(expected = Exception.class)
    public void getOtherSexReturnExeption() throws Exception{
        lion = new Lion(feline, OTHER_KIND_ANIMAL);
    }

    @Test
    public void getKittensTest() throws Exception {
        lion = new Lion(feline, FEMALE);
        Mockito.when(feline.getKittens()).thenReturn(ONE_KITTENS);
        assertEquals(ONE_KITTENS, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        lion = new Lion(feline, FEMALE);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(EXPECTED_PREDATOR_DISHES_LIST);
        assertEquals(EXPECTED_PREDATOR_DISHES_LIST, lion.getFood());
    }
}
