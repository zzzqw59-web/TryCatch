package test.exam;

public class WrapperTest2 {
    static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        double sum = 0;

        for (String s : array) {
            double i = Double.parseDouble(s);
            sum += i;
        }

        System.out.println("sum = " + sum);

    }
}
