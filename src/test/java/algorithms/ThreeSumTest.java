package algorithms;

import files.FileUtils;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

import static org.fest.assertions.Assertions.assertThat;

import static org.junit.Assert.*;

public class ThreeSumTest {

    @Test
    public void testCount() throws FileNotFoundException {

        List<Integer> data = loadData();
        ThreeSum threeSum = new ThreeSum();
        StopWatch stopWatch = new StopWatch();

        int triplesCount = threeSum.countTriplesFast(data);
        System.out.println("Total time, ms :" + stopWatch.elapsedTime());

        assertThat(triplesCount).isEqualTo(8000000);
    }

    private List<Integer> loadData() throws FileNotFoundException
    {
        String filePath = "src/test/resources/data.txt";
        List<String> data = FileUtils.loadFile(filePath);

        return data.stream()
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
    }
}