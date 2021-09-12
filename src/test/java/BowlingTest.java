
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BowlingTest {

    BowlingGame bowlingGame;
    @Before
    public void setUp(){
        bowlingGame = new BowlingGame();
    }
    @Test
    public void scoringOne(){
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.pinsHit(1);
        assertEquals(1,bowlingGame.getScore());
    }
    @Test
    public void scoringAllOnes(){
        hittingMultiplePins(20,1);
        assertEquals(20,bowlingGame.getScore());
    }

    private void hittingMultiplePins(int n, int pins) {
        for(int i = 0; i < n; i++){
            bowlingGame.pinsHit(pins);
        }
    }

    @Test
    public void scoringAllTwos(){
        hittingMultiplePins(20,2);
        assertEquals(40,bowlingGame.getScore());
    }
    @Test
    public void scoringSpareThenSix(){
        hittingMultiplePins(2,5);
        bowlingGame.pinsHit(6);
        assertEquals(22,bowlingGame.getScore());
    }

}
