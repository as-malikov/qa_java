import com.example.Animal;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    private Animal animal;

    @Before
    public void initAnimal() {
        animal = new Animal();
    }

    @Test
    public void getPredatorReturnList() {
        try {
            String predator = "Хищник";
            List<String> expectedDishesList = List.of("Животные", "Птицы", "Рыба");
            List<String> actuaDisheslList = animal.getFood(predator);
            assertEquals(expectedDishesList, actuaDisheslList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getHerbivoreReturnList() {
        try {
            String herbivore = "Травоядное";
            List<String> expectedDishesList = List.of("Трава", "Различные растения");
            List<String> actuaDisheslList = animal.getFood(herbivore);
            assertEquals(expectedDishesList, actuaDisheslList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getFamilyReturnString() {
        String expectedFamily = "Существует несколько семейств: заячьи, " +
                "беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualFamily = animal.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }
}