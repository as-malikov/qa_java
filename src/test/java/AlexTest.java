import com.example.AlexLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static Constants.AnimalsConstants.*;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    private Feline feline;
    private AlexLion alexLion;


    @Before
    public void initAlex() {
        alexLion = new AlexLion(feline);
    }

    @Test
    public void getFriendsReturnFriendsListTest() {
        List<String> actualFriendsList = alexLion.getFriends();
        assertEquals(EXEPTED_ALEX_FRENDS_LIST, actualFriendsList);
    }

    @Test
    public void getPlaceOfLivingReturnPlaceStringTest() {
        String actualPlaceOfLiving = alexLion.getPlaceOfLiving();
        assertEquals(EXEPTED_ALEX_PLACE_OF_LIVING, actualPlaceOfLiving);
    }

    @Test
    public void getKittensReturnZeroTest() {
        int actualKittensCount = alexLion.getKittens();
        assertEquals(EXEPTED_NULL_KITTENS, actualKittensCount);
    }

}
