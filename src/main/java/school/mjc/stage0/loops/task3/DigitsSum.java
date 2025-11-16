package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String numStr = "" + t;
        int sum = 0;
        int startIndex = (numStr.charAt(0) == '-') ? 1 : 0;
        for (int i = startIndex; i < numStr.length(); i++) {
            sum += numStr.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
