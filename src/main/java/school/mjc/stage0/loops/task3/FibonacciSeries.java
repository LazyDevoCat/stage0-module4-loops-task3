package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(first);
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
