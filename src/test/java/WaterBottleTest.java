import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void checkVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkFromBottle(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void checkBottleCanEmpty(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void checkBottleCanBeFilled(){
        assertEquals(100, waterBottle.fill(100));
    }
}
