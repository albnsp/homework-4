public class Task1 {
    public static void main(String[] args) {
        System.out.println("задание 1");
        int N = 3; // исходное число
        int mask = ~(1 << 0); // маска для обнуления бита в нулевом разряде
        int result = N & mask; // обнуление бита в нулевом разряде
        System.out.println(Integer.toBinaryString(result));

    }
}
