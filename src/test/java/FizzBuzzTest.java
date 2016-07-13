import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class FizzBuzzTest {

    // TODO 5. 5の倍数場合はBuzzを返すこと
    // TODO 6. 3と5の倍数場は合FizzBuzzを返すこと
    // TODO 7. 1から100の数列をfizzbuzz配列に変換すること

    public static abstract class FizzBuzzSetup {
        FizzBuzz fizzbuss;

        @Before
        public void setUp() {
            fizzbuss = new FizzBuzz();
        }
    }

    public static class _3の倍数でも5の倍数でもない場合 extends FizzBuzzSetup {
        @Test
        public void 数字を返すこと_2() {
            assertEquals("2", fizzbuss.convert(2));
        }

        @Test
        public void 数字を返すこと_4() {
            assertEquals("4", fizzbuss.convert(4));
        }
    }

    public static class _3の倍数の場合 extends FizzBuzzSetup {
        @Test
        public void fizzを返すこと() {
            assertEquals("fizz", fizzbuss.convert(3));
        }

    }

}
