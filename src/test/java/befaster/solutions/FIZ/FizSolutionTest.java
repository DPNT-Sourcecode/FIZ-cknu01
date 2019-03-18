package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

public class FizSolutionTest {

    private FizzBuzzSolution fizzBuzzSolution ;

    @Before
    public void setUp() {

        fizzBuzzSolution = new FizzBuzzSolution();
    }

    @Test
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
}

