import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("задание 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        int i = scanner.nextInt();

        int mask = 1 << i; // создаем маску для инвертирования i-го бита
        N ^= mask; // инвертируем i-й бит

        System.out.println(Integer.toBinaryString(N));
    }
}
