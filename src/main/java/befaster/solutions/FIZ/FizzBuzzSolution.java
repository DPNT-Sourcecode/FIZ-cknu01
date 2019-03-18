package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if(isDivisibleByNumber(number, 3) && isDivisibleByNumber(number, 5)) {
            return "fizz buzz";
        } else if (isDivisibleByNumber(number, 3)) {
            return "fizz";
        } else if (isDivisibleByNumber(number, 5)) {
            return "buzz";
        } else {
            return number.toString();
        }
    }


    private boolean isDivisibleByNumber(Integer number, Integer divisor)  {

        return number % divisor == 0;

    }

}

