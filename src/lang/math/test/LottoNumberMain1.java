package lang.math.test;

import java.util.Arrays;

public class LottoNumberMain1 {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] numbers = lottoGenerator.generate();
        Arrays.sort(numbers);
        System.out.println("로또 번호: " + Arrays.toString(numbers));

    }
}
