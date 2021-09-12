
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
        throwingMultipaleTimes(19,0);
        assertEquals(1,bowlingGame.calculateScore());
    }
    @Test
    public void scoringAllOnes(){
        throwingMultipaleTimes(20,1);
        assertEquals(20,bowlingGame.calculateScore());
    }
    @Test
    public void scoringAllTwos(){
        throwingMultipaleTimes(20,2);
        assertEquals(40,bowlingGame.calculateScore());
    }
    @Test
    public void scoringSpareThenSix(){
        throwingMultipaleTimes(2,5);
        bowlingGame.pinsHit(6);
        throwingMultipaleTimes(17,0);
        assertEquals(22,bowlingGame.calculateScore());
    }
    @Test
    public void scoringStrikeThenTwoTimesFour(){
        throwingMultipaleTimes(1,10);
        throwingMultipaleTimes(2,4);
        assertEquals(26,bowlingGame.calculateScore());
    }
    @Test
    public void scoringPerfektGame(){
        throwingMultipaleTimes(12,10);
        assertEquals(300,bowlingGame.calculateScore());
    }
    @Test
    public void scoringAllFives(){
        throwingMultipaleTimes(21,5);
        assertEquals(150,bowlingGame.calculateScore());
    }

    private void throwingMultipaleTimes(int times, int pins) {
        for(int i = 0; i < times; i++){
            bowlingGame.pinsHit(pins);
        }
    }
}
