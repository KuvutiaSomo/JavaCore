package algorithms;

import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public int countTriplesFast(List<Integer> data)
    {
        Collections.sort(data);
        int dataLength = data.size();
        int cnt = 0;

        for (int i = 0; i < dataLength; i++)
            for (int j = i+1; j < dataLength; j++)
                if (getIndexOfElement(data, i, j) > j)
                {
                    cnt++;
                }
        return cnt;
    }

    public int countTriples(List<Integer> data)
    {
        int dataLength = data.size();
        int cnt = 0;

        for (int i = 0; i < dataLength; i++)
            for (int j = i+1; j < dataLength; j++)
                for (int k = j+1; k < dataLength; k++)
                    if (isTripleSum(data.get(i), data.get(j), data.get(k)))
                        cnt++;
        return cnt;
    }

    private boolean isTripleSum(Integer arg1, Integer arg2, Integer arg3)
    {
        return arg1 + arg2 + arg3 == 0;
    }

    private int getIndexOfElement(List<Integer> data, int i, int j)
    {
        int key = -data.get(i)-data.get(j);
        return Collections.binarySearch(data, key);
    }
}
