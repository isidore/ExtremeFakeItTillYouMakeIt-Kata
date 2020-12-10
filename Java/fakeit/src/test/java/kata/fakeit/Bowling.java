package kata.fakeit;

import com.spun.util.StringUtils;

import java.util.ArrayList;

public class Bowling {
    ArrayList<Frame> frames = new ArrayList<>();

    public void roll(int... rolls) {
        int rollIndex = 0;
        int previousScore = 0;
        for (int frameNumber = 1; frameNumber <= 10; frameNumber++) {
            Frame frame = new Frame(frameNumber);
            frame.previousScore = previousScore;
            frame.roll1 = rolls[rollIndex];
            if (frame.isStrike()) {

                frame.roll2 = rolls[rollIndex + 1];
                frame.roll3 = rolls[rollIndex + 2];
                rollIndex += 1;

            } else {
                frame.roll2 = rolls[rollIndex + 1];
                if (frame.isSpare()) {
                    frame.roll3 = rolls[rollIndex + 2];
                }

                rollIndex += 2;
            }
            frames.add(frame);
            previousScore = frame.getTotalScore();
        }

    }

    public String printScore() {

        return StringUtils.join(frames, "", f -> f.toString());
    }

}
