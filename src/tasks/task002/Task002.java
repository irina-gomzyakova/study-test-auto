package tasks.task002;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите число");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a > 20) {
                System.out.println("Дофига хочешь");
            } else {
                for (int i = 0; i <= a; i++) {
                    System.out.println(i);
                }
            }
            System.out.println("Продолжить?");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("нет")) {
                break;
            }
        }
    }
}
