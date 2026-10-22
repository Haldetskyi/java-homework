import java.util.Scanner;

public class Task1RangeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===АНАЛІЗАТОР ДІАПАЗОНУ ЧИСЕЛ ===");
        int n;
        do {
            System.out.print("Введіть число: ");
             n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("число має бути більшим за 0");
            }
        }while (n <= 0);
        int sum = 0;
        int even = 0;
        int odd = 0;
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
            if (i % 2 == 0){
                even += i;
                evenCount++;
            } else { odd +=i;
                oddCount++;}
        }
        double average = (double) sum / n;
        System.out.println("---РЕЗУЛЬТАТИ ДЛЯ ДІАПАЗОНУ [1 .. " + n + "] ---");
        System.out.println("Загальна сума чисел:       " + sum);
        System.out.printf("Сума парних чисел:         " + even + " (кількість: %1d)", evenCount);
        System.out.println();
        System.out.printf("Сума непарних чисел:       " + odd + " (кількість: %1d)",oddCount);
        System.out.println();
        System.out.println("Середнє арифметичне:       " + average);
        System.out.print("=========================================");
    }
}