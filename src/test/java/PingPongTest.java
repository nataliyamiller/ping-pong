import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

    @Test
    public void isPingPong_forNumberReturnArray_true() {
        PingPong pingPong = new PingPong();
        String[] expectedArray = { "1", "2" };
        assertEquals(expectedArray, pingPong.isPingPong(2));

    }

    @Test
    public void isPingPong_forNumberDivisibleByThree_true() {
    PingPong pingPong = new PingPong();
    String[] expectedArray = { "1", "2", "ping" };
    assertEquals(expectedArray, pingPong.isPingPong(3));
}

   @Test
   public void isPingPong_forNumberDivisibleByFive_true(){
   PingPong pingPong = new PingPong();
    String[] expectedArray = {"1", "2", "ping", "4", "pong"};
    assertEquals(expectedArray, pingPong.isPingPong(5));

   }

   @Test
   public void isPingPong_forNumberDivisibleByFifteen_true() {
       PingPong pingPong = new PingPong();
       String[] expectedArray = {"1", "2", "ping", "4", "pong", "ping", "7", "8", "ping",
       "pong", "11", "ping", "13", "14", "ping-pong" };
       assertEquals(expectedArray, pingPong.isPingPong(15));
   }

}
