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
}
