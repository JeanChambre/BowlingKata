

public class BowlingGame {

    private int numberOfRolls = 0;
    private int[] allRoles = new int[20];

    public void pinsHit(int pins){
        allRoles[numberOfRolls++] = pins;
    }
    public int calculateScore(){
        int score = 0;
        int pointer = 0;
        for (int i = 0; i < 20 ; i++){
            score += allRoles[i];
        }
        return  score;
    }

}
