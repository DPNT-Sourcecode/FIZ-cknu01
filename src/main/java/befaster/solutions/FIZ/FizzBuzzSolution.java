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

        String result;

        if(isBuzz && isFizz && isDeluxe) {
            result = FIZZ_BUZZ_DELUXE.getValue();
        }else if(isBuzz && isFizz) {
            result = FIZZ_BUZZ.getValue();
        } else if(isBuzz && isDeluxe) {
            result = BUZZ_DELUXE.getValue();
        } else if(isFizz && isDeluxe){
            result = FIZZ_DELUXE.getValue();
        } else if (isDeluxe) {
            result = DELUXE.getValue();
        } else if(isBuzz) {
            result = BUZZ.getValue();
        } else if(isFizz){
            result = FIZZ.getValue();
        } else {
            result = number.toString();
        }

        if(result.contains("deluxe") && isOdd(number)) {
            result = result.replace("deluxe", "fake deluxe");
        }

        return result;
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

    private boolean isOdd(Integer number) {
        return (number & 1) != 0;
    }

    private boolean hasAllSameDigits(Integer number) {

        String numberAsStr = number.toString();

        if(numberAsStr.replaceAll("1", "").length() == 0) {
            return true;
        } else if(numberAsStr.replaceAll("2", "").length() == 0) {
            return true;
        } else if(numberAsStr.replaceAll("3", "").length() == 0) {
            return true;
        } else if(numberAsStr.replaceAll("4", "").length() == 0) {
            return true;
        } else if(numberAsStr.replaceAll("5", "").length() == 0) {
            return true;
        } else if(numberAsStr.replaceAll("6", "").length() == 0) {
            return true;
        } else if(numberAsStr.replaceAll("7", "").length() == 0) {
            return true;
        } else if(numberAsStr.replaceAll("8", "").length() == 0) {
            return true;
        } else return numberAsStr.replaceAll("9", "").length() == 0;
    }


    enum FIZZ_BUZZ_DELUXE {

        FIZZ("fizz"),
        BUZZ("buzz"),
        DELUXE("deluxe"),
        FIZZ_BUZZ("fizz buzz"),
        FIZZ_DELUXE("fizz deluxe"),
        BUZZ_DELUXE("buzz deluxe"),
        FIZZ_BUZZ_DELUXE("fizz buzz deluxe"),
        FAKE_DELUXE("fake deluxe");

        String value;

        FIZZ_BUZZ_DELUXE(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}

