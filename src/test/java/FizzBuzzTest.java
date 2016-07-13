import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class FizzBuzzTest {

    // TODO 4. 3の倍数場合はFizzを返すこと
    // TODO 5. 5の倍数場合はBuzzを返すこと
    // TODO 6. 3と5の倍数場は合FizzBuzzを返すこと
    // TODO 7. 1から100の数列をfizzbuzz配列に変換すること

    public static class _3の倍数でも5の倍数でもない場合 {
        FizzBuzz fizzbuss;

        @Before
        public void setUp() {
            fizzbuss = new FizzBuzz();
        }

        @Test
        public void 数字を返すこと_2() {
            assertEquals("2", fizzbuss.convert(2));
        }
        // TODO 1. 数値2以外のケースでも期待通り数字返すことを確認
    }
}
