

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double [] numbers = {2.3, 3.8, -4.2, 5.2, 6.2, 7.2, -8.4, 9.2, -10.2, -11.2, 12.2, -13.2, 14.2, 15.2, -16.1};
        boolean isNegative = false;
        double sum = 0.0;
        int count = 0;
        for (double i: numbers) {
            if (i < 0) {
                isNegative = true;
            } else if (isNegative && i > 0) {
                sum += i;
                count++;
            }
        }
        double awg = sum / count;
        System.out.println("Среднее положительных чисел после первого отрицательного: " + awg);
    }
}