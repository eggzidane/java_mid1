package lang.math.test;

import java.util.Arrays;

public class LottoNumberMain2 {

    public static void main(String[] args) {
        LottoGenerator2 lottoGenerator2 = new LottoGenerator2();
        int[] numbers = lottoGenerator2.generate();
        System.out.println("로또 번호: " + Arrays.toString(numbers));

    }
}
