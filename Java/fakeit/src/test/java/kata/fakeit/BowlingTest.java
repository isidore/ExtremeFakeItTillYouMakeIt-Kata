package kata.fakeit;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    @Test
    public void testWraper() {
       // TestCounter.ResetAndLaunch("javaw", new File("counterDisplay.jar").getAbsolutePath());// Comment out after 1st run
        TestCounter.Track(this::test);
    }

    public void test() {
        // start bowling
        Bowling b = new Bowling();
        // roll the 3,5,9,0,3,7,8,1,10,10,6,2,5,4,7,3,10,6,3
        b.roll( 3,5,9,0,3,7,8,1,10,10,6,2,5,4,7,3,10,6,3);
        String expected = "1) 3, 5 [8] = 8\n" +
                "2) 9, 0 [9] = 17\n" +
                "3) 3, 7 [18] = 35\n" +
                "4) 8, 1 [9] = 44\n" +
                "5) 10 [26] = 70\n" +
                "6) 10 [18] = 88\n" +
                "7) 6, 2 [8] = 96\n" +
                "8) 5, 4 [9] = 105\n" +
                "9) 7, 3 [20] = 125\n" +
                "10) 10, 6, 3 [19] = 144\n";
        // verify the score
        assertEquals(expected, b.printScore());
    }
}
