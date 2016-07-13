public class FizzBuzz {

    public String convert(int number) {
        if (isThreeTimes(number)) {
            return "fizz";
        } else if (isFiveTimes(number)) {
            return "buzz";
        }
        return String.valueOf(number);
    }

    private boolean isFiveTimes(int number) {
        return number % 5 == 0;
    }

    private boolean isThreeTimes(int number) {
        return number % 3 == 0;
    }
}
// TODO これは不要コメント