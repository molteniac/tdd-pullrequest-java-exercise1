public class FizzBuzz {

    public String convert(int number) {

        if (isThreeTimes(number)) {
            return "fizz";
        }

        return String.valueOf(number);
    }

    private boolean isThreeTimes(int number) {
        return number % 3 == 0;
    }

}
// TODO これは不要コメント