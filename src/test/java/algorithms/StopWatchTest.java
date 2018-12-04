package algorithms;

import javafx.scene.paint.Stop;
import org.junit.Test;

import static org.junit.Assert.*;

public class StopWatchTest {

    @Test
    public void testStopWatch() throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        Thread.sleep(10);
        double elapsedTime = stopWatch.elapsedTime();

        System.out.println(elapsedTime);
    }
}