package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        if (secondBoarder == firstBoarder) {
            System.out.println(firstBoarder);
        } else if (secondBoarder > firstBoarder) {
            int f_sum = 0;
            for (int sum = firstBoarder; sum <= secondBoarder; sum++) {
                f_sum = f_sum + sum;
            }
            System.out.println(f_sum);
        }
    }
}