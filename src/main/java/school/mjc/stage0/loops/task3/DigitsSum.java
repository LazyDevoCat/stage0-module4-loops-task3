package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        String s = Integer.toString(t);
        int counter = (int) s.length();

        int summ = t % 10;
        int new_num = t / 10;


        for (int start = 0; start <= counter; start++ ) {

            summ = summ + new_num % 10;
            new_num = new_num / 10;
        }

        if (summ < 0) {
            System.out.println(summ * -1);
        }
        else {System.out.println(summ);}

    }

}

