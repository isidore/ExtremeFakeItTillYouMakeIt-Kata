package kata.fakeit;

import com.spun.util.LambdaThreadLauncher;
import com.spun.util.ThreadUtils;
import com.spun.util.io.FileUtils;
import com.spun.util.tests.TestUtils;
import org.lambda.actions.Action0;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class TestCounter {


    public static final File passFile = new File("fakeit.counter.pass.txt");
    public static final File failFile = new File("fakeit.counter.fail.txt");

    public static void IncrementSuccess() {
        playSound("..\\..\\sounds\\SwordIn-001.wav");
        Increment(passFile);
    }

    private static void playSound(String wavFile) {
        try {
            File file = new File(wavFile).getCanonicalFile();
            AudioInputStream input = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(input);
            clip.start();
            ThreadUtils.sleep(600);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void IncrementFailure() {
        playSound("..\\..\\sounds\\Crickets-000.wav");
        Increment(failFile);
    }

    public static void Increment(File file) {
        long count = 0;
        if (file.exists()) {
            String currentCount = FileUtils.readFile(file).trim();
            count = Long.parseLong(currentCount);
        }
        count++;
        FileUtils.writeFile(file, "" + count);
    }

    public static void Reset() {
        FileUtils.writeFile(passFile, "0");
        FileUtils.writeFile(failFile, "0");

    }

    private static void delete(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void ResetAndLaunch(String counterDisplayJar) {
        ResetAndLaunch("javaw", counterDisplayJar);
    }

    public static void ResetAndLaunch(String javaPath, String counterDisplayJar) {
        Reset();
        Launch(javaPath, counterDisplayJar);
    }

    public static void Launch(String java, String jar) {
        new LambdaThreadLauncher(
                () -> {
                    try {
                        String command = String.format("javaw -jar %s %s %s", jar, passFile.getCanonicalPath(), failFile.getCanonicalPath());
                        Runtime.getRuntime().exec(command);
                    } catch (Exception e) {
                        // do nothing
                    }
                });
    }


    public static void Track(Action0 test) {
        try {
            test.call();
            IncrementSuccess();
        } catch (Throwable e) {
            IncrementFailure();
            throw e;
        }
    }
}
