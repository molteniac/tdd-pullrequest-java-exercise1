public class FizzBuzz {

    public String convert(int number) {

        if (isFifteenTimes(number)) {
            return "FizzBuzz";
        } else if (isThreeTimes(number)) {
            return "fizz";
        } else if (isFiveTimes(number)) {
            return "buzz";
        }
        return String.valueOf(number);
    }

    private boolean isFifteenTimes(int number) {
        return number % 15 == 0;
    }

    private boolean isFiveTimes(int number) {
        return number % 5 == 0;
    }

    private boolean isThreeTimes(int number) {
        return number % 3 == 0;
    }
}
