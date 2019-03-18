package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FizSolutionTest {

    private FizzBuzzSolution fizzBuzzSolution ;

    @Before
    public void setUp() {

        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
    @Ignore
    public void fizzBuzz() {
        System.out.println(fizzBuzzSolution.fizzBuzz(1));
        assert(fizzBuzzSolution.fizzBuzz(1).equals("1"));

        System.out.println(fizzBuzzSolution.fizzBuzz(9999));
        assert(fizzBuzzSolution.fizzBuzz(9999).equals("fizz"));

        System.out.println(fizzBuzzSolution.fizzBuzz(3));
        assert(fizzBuzzSolution.fizzBuzz(3).equals("fizz"));

        System.out.println(fizzBuzzSolution.fizzBuzz(15));
        assert(fizzBuzzSolution.fizzBuzz(15).equals("fizz buzz"));
    }

    @Test
    @Ignore
    public void fizzBuzz2() {
        assert(fizzBuzzSolution.fizzBuzz(1).equals("1"));
        assert(fizzBuzzSolution.fizzBuzz(9999).equals("fizz"));
        assert(fizzBuzzSolution.fizzBuzz(3).equals("fizz"));
        assert(fizzBuzzSolution.fizzBuzz(31).equals("fizz"));
        assert(fizzBuzzSolution.fizzBuzz(315).equals("fizz buzz"));
        assert(fizzBuzzSolution.fizzBuzz(5).equals("buzz"));
        assert(fizzBuzzSolution.fizzBuzz(60).equals("fizz buzz"));
        assert(fizzBuzzSolution.fizzBuzz(15).equals("fizz buzz"));
    }

    @Test
    public void fizzBuzz3() {
        assert(fizzBuzzSolution.fizzBuzz(1).equals("1"));
        assert(fizzBuzzSolution.fizzBuzz(9999).equals("fizz"));
        assert(fizzBuzzSolution.fizzBuzz(3).equals("fizz fake deluxe"));
        assert(fizzBuzzSolution.fizzBuzz(31).equals("fizz"));
        assert(fizzBuzzSolution.fizzBuzz(315).equals("fizz buzz fake deluxe"));
        assert(fizzBuzzSolution.fizzBuzz(5).equals("buzz fake deluxe"));
        assert(fizzBuzzSolution.fizzBuzz(60).equals("fizz buzz"));
        assert(fizzBuzzSolution.fizzBuzz(15).equals("fizz buzz fake deluxe"));

        // New
        assert(fizzBuzzSolution.fizzBuzz(10).equals("buzz"));
        assert(fizzBuzzSolution.fizzBuzz(33).equals("fizz fake deluxe"));
        assert(fizzBuzzSolution.fizzBuzz(55).equals("buzz fake deluxe"));
        assert(fizzBuzzSolution.fizzBuzz(50).equals("buzz deluxe"));
        assert(fizzBuzzSolution.fizzBuzz(350).equals("fizz buzz deluxe"));
        assert(fizzBuzzSolution.fizzBuzz(555).equals("fizz buzz fake deluxe"));

    }
}


