

public class BowlingGame {

    private int score = 0;

    public void pinsHit(int pins){
        score = score + pins;
    }
    public int getScore(){
        return  score;
    }

}
