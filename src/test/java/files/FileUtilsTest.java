package files;

import algorithms.StopWatch;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.Assert.*;

public class FileUtilsTest {

    @Test
    public void testLoadFile() throws FileNotFoundException {

        StopWatch stopWatch = new StopWatch();

        String filePath = "src/test/resources/FileForTest.txt";
        List<String> data = FileUtils.loadFile(filePath);

        System.out.println(data);
        System.out.println(stopWatch.elapsedTime());
    }
}