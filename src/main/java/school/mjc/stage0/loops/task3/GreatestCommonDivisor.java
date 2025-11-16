package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0 && second == 0) {
            System.out.println(0);
        }
        else if (first == 0) {
            System.out.println(second);
        }
        else if (second == 0) {
            System.out.println(first);
        } else {

            int min = first < second ? first : second;
            int gcd = 1;

            for (int divider = 1; divider <= min; divider++) {
                if (first % divider == 0 && second % divider == 0) {
                    gcd = divider;
                }
            }
            System.out.println(gcd);
        }
    }
}

