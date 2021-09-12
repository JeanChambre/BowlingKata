

public class BowlingGame {

    private int numberOfRolls = 0;
    private int[] allRoles = new int[21];

    public void pinsHit(int pins){
        allRoles[numberOfRolls++] = pins;
    }
    public int calculateScore(){
        int score = 0;
        int pointer = 0;
        for (int frame = 0; frame < 10 ; frame++){
            if(isStrike(pointer)){
                score += 10 + allRoles[pointer + 1] + allRoles[pointer + 2];
                pointer += 1;
            }
            else if(isSpare(pointer)){
                score += 10 + allRoles[pointer + 2];
                pointer += 2;
            }
            else{
                score += allRoles[pointer] + allRoles[pointer + 1];
                pointer += 2;
            }
        }
        return  score;
    }
    private boolean isStrike(int pointer) {
        return allRoles[pointer] == 10;
    }
    private boolean isSpare(int pointer) {
        return allRoles[pointer] + allRoles[pointer + 1] == 10;
    }

}
