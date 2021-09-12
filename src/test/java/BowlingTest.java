
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BowlingTest {

    @Test
    public void scoringOne(){
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.pinsHit(1);
        assertEquals(1,bowlingGame.getScore());
    }


}
