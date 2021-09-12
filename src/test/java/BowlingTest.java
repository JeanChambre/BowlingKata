
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
        bowlingGame.pinsHit(1);
        hittingMultiplePins(19,0);
        assertEquals(1,bowlingGame.calculateScore());
    }
    @Test
    public void scoringAllOnes(){
        hittingMultiplePins(20,1);
        assertEquals(20,bowlingGame.calculateScore());
    }
    @Test
    public void scoringAllTwos(){
        hittingMultiplePins(20,2);
        assertEquals(40,bowlingGame.calculateScore());
    }
    @Test
    public void scoringSpareThenSix(){
        hittingMultiplePins(2,5);
        bowlingGame.pinsHit(6);
        hittingMultiplePins(17,0);
        assertEquals(22,bowlingGame.calculateScore());
    }
    @Test
    public void scoringStrikeThenTwoTimesFour(){
        hittingMultiplePins(1,10);
        hittingMultiplePins(2,4);

        assertEquals(26,bowlingGame.calculateScore());
    }
    @Test
    public void scoringPerfektGame(){
        hittingMultiplePins(10,10);
        assertEquals(300,bowlingGame.calculateScore());
    }

    private void hittingMultiplePins(int n, int pins) {
        for(int i = 0; i < n; i++){
            bowlingGame.pinsHit(pins);
        }
    }
}
