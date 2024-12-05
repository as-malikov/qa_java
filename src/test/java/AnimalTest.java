import com.example.Animal;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static Constants.AnimalsConstants.*;

public class AnimalTest {

    private Animal animal;

    @Before
    public void initAnimal() {
        animal = new Animal();
    }

    @Test
    public void getPredatorReturnDishesListTest() {
        try {
            List<String> actuaDisheslList = animal.getFood(PREDATOR);
            assertEquals(EXPECTED_PREDATOR_DISHES_LIST, actuaDisheslList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void getHerbivoreReturnDishesListTest() {
        try {
            List<String> actuaDisheslList = animal.getFood(HERBIVORE);
            assertEquals(EXPECTED_HERBIVORE_DISHES_LIST, actuaDisheslList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test(expected = Exception.class)
    public void getOtherReturnExceptionTest() throws Exception {
        animal.getFood(OTHER_KIND_ANIMAL);
    }

    @Test
    public void getFamilyReturnFamilyTest() {
        String actualFamily = animal.getFamily();
        assertEquals(EXPECTED_FAMILY, actualFamily);
    }
}