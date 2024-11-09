import java.util.Arrays;
import java.util.Random;
public class Main {
    private static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        // Задание 1
        int[] arr = generateRandomArray();
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей");
        // Задание 2
        int[] arr2 = generateRandomArray();
        int max = -2;
        long min = 20_000_000L;
        for (int i : arr2) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : arr2) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей");
        // Задание 3
        int[] arr3 = generateRandomArray();
        int sum = 0;
        int numberOfMondays = 0;
        for (int i : arr3) {
            numberOfMondays++;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr3[i];
        }
        float averageProfit = (float) sum / numberOfMondays;
        System.out.println(averageProfit);
        // Задание 4
        char num =0;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (char i = 0; i < reverseFullName.length/2; i++) {
            num = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length - i - 1] = num;
        }
        System.out.println(Arrays.toString(reverseFullName));
    }
}