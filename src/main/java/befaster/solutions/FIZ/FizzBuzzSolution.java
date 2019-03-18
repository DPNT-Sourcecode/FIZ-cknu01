package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

//        if(isDivisibleByNumber(number, 3) && isDivisibleByNumber(number, 5)) {
//            return "fizz buzz";
//        } else if (isDivisibleByNumber(number, 3)) {
//            return "fizz";
//        } else if (isDivisibleByNumber(number, 5)) {
//            return "buzz";
//        } else {
//            return number.toString();
//        }

        boolean isFizz = false;
        boolean isBuzz = false;

        if(containsANumber(number, 3)) {
            isFizz = true;
        }

        if(isDivisibleByNumber(number, 3)) {
            isFizz = true;
        }

        if(containsANumber(number, 5)) {
            isBuzz = true;
        }

        if(isDivisibleByNumber(number, 5)) {
            isBuzz = true;
        }

        if(isBuzz && isFizz) {
            return "fizz buzz";
        } else if(isBuzz) {
            return "buzz";
        } else if(isFizz){
            return "fizz";
        } else {
            return number.toString();
        }
    }


    private boolean isDivisibleByNumber(Integer number, Integer divisor)  {

        return number % divisor == 0;
    }

    private boolean containsANumber(Integer number, Integer contained) {

        return number.toString().contains(contained.toString());
    }
}

