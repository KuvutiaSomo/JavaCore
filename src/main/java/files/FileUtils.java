package files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileUtils {

    public static List<String> loadFile(String filePath) throws FileNotFoundException {

        File file = new File(filePath);
        Reader reader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(reader);

        return bufferedReader
                .lines()
                .collect(Collectors.toList());
    }
}
