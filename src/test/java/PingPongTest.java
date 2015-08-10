import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

    @Test
    public void isPingPong_forNumberDivisibleByThree_true() {
        PingPong pingPong = new PingPong();
        String[] expectedArray = { "0", "1", "2" };
        assertEquals(expectedArray, pingPong.isPingPong(3));

    }
}
