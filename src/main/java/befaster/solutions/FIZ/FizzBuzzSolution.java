package befaster.solutions.FIZ;

import static befaster.solutions.FIZ.FizzBuzzSolution.FIZZ_BUZZ_DELUXE.*;

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
        boolean isDeluxe = false;

        if(isDeluxe(number, 10)) {
            isDeluxe = true;
        }

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

        if(isBuzz && isFizz && isDeluxe) {
            return FIZZ_BUZZ_DELUXE.getValue();
        }else if(isBuzz && isFizz) {
            return FIZZ_BUZZ.getValue();
        } else if(isBuzz && isDeluxe) {
            return BUZZ_DELUXE.getValue();
        } else if(isFizz && isDeluxe){
            return FIZZ_DELUXE.getValue();
        } else if (isDeluxe) {
            return DELUXE.getValue();
        } else if(isBuzz) {
            return BUZZ.getValue();
        } else if(isFizz){
            return FIZZ.getValue();
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

    private boolean isDeluxe(Integer number, Integer value) {
        return isBiggerThan(number, value) && hasAllSameDigits(number);
    }

    private boolean isBiggerThan(Integer number, Integer value) {
        return number > value;
    }

    private boolean hasAllSameDigits(Integer number) {
        return number.toString().matches("^[1-9]*$");
    }


    enum FIZZ_BUZZ_DELUXE {

        FIZZ("fizz"),
        BUZZ("buzz"),
        DELUXE("deluxe"),
        FIZZ_BUZZ("fizz buzz"),
        FIZZ_DELUXE("fizz deluxe"),
        BUZZ_DELUXE("buzz deluxe"),
        FIZZ_BUZZ_DELUXE("fizz buzz deluxe");

        String value;

        FIZZ_BUZZ_DELUXE(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}


