import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print  ("Введите число N: ");
        int N = scanner.nextInt();
        int i = scanner.nextInt();

        int mask = (1 << i) - 1; // создаем маску для обнуления всех битов, кроме i-го
        N &= mask; // обнуляем все биты, кроме i-го

        System.out.println(Integer.toBinaryString(N));

        /*
        // артем, не смотри сюда

// 1
        int i = 0;
        while (i <= 5) {
            System.out.println(i++);
        }
// 2

        int start = -1;
        do {
            System.out.println(start);
            start = start -1;
        } while (start > 0);

        // 3
        int i = 5;
        while (i < 9) {
            System.out.println(i);
            i++;
        }

        int i1 = 5;
        do {
            System.out.println(i1);
            i1++;
        } while (i1 < 9);



                            //4 ОЧЕНЬ важно!!!!!!!
        Scanner sc = new Scanner(System.in);
        System.out.println("наптшите числе: ");
        int i = sc.nextInt();
        for (;  i < 1000;  i++) {
            System.out.println("привет");

        //вечный (без остановки)
        for (int i = 0;  i < 1000; ) {
            System.out.println("привет + 1");
        }


        for (int i = 0; i <= 10; i= i+1){
            System.out.println("ЭТО ЧИСЛО"+i);

            for (int i = 1, j =3; i < 5 & j >0; i++, --j) {
                System.out.println("i = " + i + " j =" + j)
         */
        }
    }

