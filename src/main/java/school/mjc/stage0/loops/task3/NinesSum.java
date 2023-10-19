package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        String number = "9";
        String num = "9";
        int sum = 9;
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
        }
        else {
            for (int i = 2; i <= lengthOfLastNumber; i++) {
                number = number + num;
                int numberInteger = Integer.parseInt(number);

                sum = sum + numberInteger;

            }
            System.out.println(sum);
        }
    }
}
