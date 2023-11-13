import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int mask = N & (N - 1); // создаем маску для обнуления крайнего левого единичного бита
        N &= ~mask; // обнуляем крайний левый единичный бит

        System.out.println(Integer.toBinaryString(N));
    }
}
