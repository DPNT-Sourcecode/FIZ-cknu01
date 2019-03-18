package befaster.solutions.SUM;

public class SumSolution {

    public int compute(int x, int y) {

        if(x > 100 || x < 0) {
            System.out.println("Param x not okay");
        }

        if(y > 100 || y < 0) {
            System.out.println("Param y not okay");
        }

        return x + y;
    }

}

