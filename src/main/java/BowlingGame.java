

public class BowlingGame {

    private int numberOfRolls = 0;
    private int[] allRoles = new int[20];

    public void pinsHit(int pins){
        allRoles[numberOfRolls++] = pins;
    }
    public int calculateScore(){
        int score = 0;
        int pointer = 0;
        for (int i = 0; i < 10 ; i++){
            if(allRoles[pointer] == 10){
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

    private boolean isSpare(int pointer) {
        return allRoles[pointer] + allRoles[pointer + 1] == 10;
    }

}
