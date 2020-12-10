package kata.fakeit;

public class Frame {
    protected int frameNumber;
    protected int roll1;
    protected int roll2;
        int roll3;
    protected int previousScore = 0;

    public Frame(int frameNumber ) {
        this.frameNumber = frameNumber;
    }

    protected int getTotalScore() {

        return getFrameScore() + previousScore;
    }

    protected int getFrameScore() {

        return roll1 + roll2 + roll3;
    }

    @Override
    public String toString() {
        return this.frameNumber + ") " + getRollsString() + " [" + this.getFrameScore() + "] = " + this.getTotalScore() + "\n";
    }

    private String getRollsString() {
        String secondRoll = ", " + this.roll2;
        if (isStrike()){
            secondRoll = "";
        }
        if (frameNumber == 10 )
        {
            if (isStrike() || isSpare()) {
                secondRoll =  ", " + this.roll2+  ", " + this.roll3;
            }
        }
        String rollsString = this.roll1 + secondRoll;
        return rollsString;
    }

    public boolean isSpare() {
        return roll1 + roll2 == 10;
    }

    public boolean isStrike() {
        return roll1 == 10;
    }
}
