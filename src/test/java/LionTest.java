import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Lion lion;
    String sex;

    @Mock
    Feline feline;

    @Before
    public void initLion() throws Exception {
        lion = new Lion(feline, sex);
    }

    @Test
    public void getKitten() {

    }

}
