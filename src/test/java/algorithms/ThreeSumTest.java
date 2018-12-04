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
        int triplesCount = threeSum.countTriples(data);

        assertThat(triplesCount).isEqualTo(1);
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