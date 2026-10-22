import java.util.Scanner;

public class Task3FibonacciSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== ЧИСЛА ФІБОНАЧЧІ ТА ЗОЛОТИЙ ПЕРЕТИН ===");
        int n;
        System.out.print("Скільки чисел згенерувати (N >= 3): ");
        n = scanner.nextInt();
        int f1 = 1;
        int f2 = 1;
        double ratio2 = 0;
        System.out.println("№ 1  | Число: " + f1);
        System.out.println("№ 2  | Число: " + f2);
        for (int i = 3; i <= n; i++) {
            int next = f1 + f2;
            double ratio = (double) next / f2;
            ratio2 = ratio;
            System.out.printf("№ %-2d | Число: %-10d | Відношення = %.6f%n", i, next, ratio);
            f1 = f2;
            f2 = next;
        }
            System.out.println();
            System.out.printf("Підсумок: наближення Золотого перетину: " + ratio2);
            System.out.println();
            System.out.println("Еталонне значення:                  1.618034");
            System.out.println();
            System.out.println("=========================================");
        }
}


