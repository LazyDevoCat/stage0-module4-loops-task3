package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int current_sum = 0;
        for (int counter = 1; counter <= lengthOfLastNumber; counter++) {
            current_sum = current_sum * 10 + 9;
            sum = sum + current_sum;

        }
        System.out.println(sum);

    }
}
