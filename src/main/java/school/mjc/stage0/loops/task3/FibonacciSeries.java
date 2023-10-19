package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;

        for (int counter = 1; counter <= lastFibonacci; counter++) {
            System.out.println(first);

            int nextNumber = first + second;

            first = second;
            second = nextNumber;
        }
    }
}
