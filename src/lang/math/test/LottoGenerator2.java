package lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator2 {
    private Random random = new Random();


    public int[] generate() {
        int lastIndex = 44;
        int[] pool =new int[45];
        for (int i = 0; i < pool.length; i++) {
            pool[i] = i + 1;
        }
        int[] result = new int[6];
        for (int i = 0; i < result.length; i++) {
            int index = random.nextInt(lastIndex + 1);
            result[i] = pool[index];
            pool[index] = pool[lastIndex];
            lastIndex--;
        }
        Arrays.sort(result);
        return result;
    }
}
