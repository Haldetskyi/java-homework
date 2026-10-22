import java.util.Scanner;

public class Task1DailySales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        double[] sales = new double[7];
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Введіть виторг за " + days[i] + " грн");
            sales[i] = scanner.nextDouble();
        }
        double total = 0;
        double max = sales[0];
        double min = sales[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < sales.length; i++) {
            total = total + sales[i];

            if (sales[i] > max) {
                max = sales[i];
                maxIndex = i;
            }
            if (sales[i] < min) {
                min = sales[i];
                minIndex = i;
            }
        }
        double average = total / sales.length;
        System.out.println();
        System.out.println("---------------- ПІДСУМКИ ----------------");
        System.out.println("Загальний тижневий виторг: " + total + " грн");
        System.out.println("Середній виторг на день: " + average + " грн");
        System.out.println("Найкращий день: " + days[maxIndex] + " (" + max + " грн)");
        System.out.println("Найгірший день: " + days[minIndex] + " (" + min + " грн)");

        System.out.println();
        System.out.println("Дні з виторгом вище середнього:");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                System.out.println("- " + days[i] + ": " + sales[i] + " грн");
            }
        }
        System.out.println("==========================================");
    }
}
