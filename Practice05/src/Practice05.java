import java.util.Arrays;
import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Завдання 1
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        numbers[0] = 10;
        numbers[2] = 30;
        numbers[4] = 50;
        System.out.println(Arrays.toString(numbers));

        // Завдання 2
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        System.out.println("Кількість днів: " + days.length);
        System.out.println("Перший день: " + days[0]);
        System.out.println("Останній день: " + days[days.length - 1]);
        days[5] = "Вихідний (Сб)";
        days[6] = "Вихідний (Нд)";
        System.out.println(Arrays.toString(days));

        // Завдання 3
        double[] prices3 = {120.50, 45.00, 890.99, 15.30, 420.00};
        System.out.println(Arrays.toString(prices3));
        prices3[2] = prices3[2] * 0.8;
        System.out.println(Arrays.toString(prices3));

        // Завдання 4
        System.out.print("Введіть N: ");
        int n = sc.nextInt();
        int[] arr4 = new int[n];
        for (int i = 0; i < n; i++) {
            arr4[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr4));

        // Завдання 5
        int[] arr5 = {4, 8, 15, 16, 23, 42};
        for (int i = arr5.length - 1; i >= 0; i--) {
            System.out.print(arr5[i] + ", ");
        }
        System.out.println();

        // Завдання 6
        int[] pow = new int[10];
        pow[0] = 1;
        for (int i = 1; i < pow.length; i++) {
            pow[i] = pow[i - 1] * 2;
        }
        System.out.println(Arrays.toString(pow));

        // Завдання 7
        int[] original = {3, 7, 1, 9, 4};
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        copy[0] = 999;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));

        // Завдання 8
        int[] grades = {95, 84, 70, 99, 65, 88, 92};
        int sum8 = 0;
        for (int i = 0; i < grades.length; i++) {
            sum8 += grades[i];
        }
        double avg8 = (double) sum8 / grades.length;
        System.out.println("Сума: " + sum8 + ", Середній бал: " + avg8);

        // Завдання 9
        int[] temps = {18, 21, 15, 24, 13, 27, 20};
        int min9 = temps[0];
        int max9 = temps[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < min9) {
                min9 = temps[i];
                minIndex = i;
            }
            if (temps[i] > max9) {
                max9 = temps[i];
                maxIndex = i;
            }
        }
        System.out.println("Мінімум: " + min9 + ", індекс " + minIndex);
        System.out.println("Максимум: " + max9 + ", індекс " + maxIndex);

        // Завдання 10
        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};
        int plus = 0;
        int minus = 0;
        int zero = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                plus++;
            } else if (data[i] < 0) {
                minus++;
            } else {
                zero++;
            }
        }
        System.out.println("Додатних: " + plus + ", від'ємних: " + minus + ", нульових: " + zero);

        // Завдання 11
        int[] arr11 = {7, 12, 3, 18, 25, 4, 9, 30, 11, 6};
        int evenCount = 0;
        int oddSum = 0;
        for (int i = 0; i < arr11.length; i++) {
            if (arr11[i] % 2 == 0) {
                evenCount++;
            } else {
                oddSum += arr11[i];
            }
        }
        System.out.println("Парних: " + evenCount);
        System.out.println("Сума непарних: " + oddSum);

        // Завдання 12
        int[] students = {1042, 2031, 3055, 4018, 5099};
        System.out.print("Введіть номер залікової: ");
        int target = sc.nextInt();
        int foundIndex = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == target) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Знайдено на позиції " + foundIndex);
        } else {
            System.out.println("Студента з таким номером не знайдено");
        }

        // Завдання 13
        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};
        System.out.print("Введіть число від 1 до 6: ");
        int number = sc.nextInt();
        int count13 = 0;
        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] == number) {
                count13++;
            }
        }
        System.out.println("Випало разів: " + count13);

        // Завдання 14
        int[] salaries14 = {18000, 25000, 32000, 15000, 41000, 29000};
        int sum14 = 0;
        for (int i = 0; i < salaries14.length; i++) {
            sum14 += salaries14[i];
        }
        double avg14 = (double) sum14 / salaries14.length;
        System.out.println("Середня зарплата: " + avg14);
        for (int i = 0; i < salaries14.length; i++) {
            if (salaries14[i] > avg14) {
                System.out.println(salaries14[i]);
            }
        }

        // Завдання 15
        double[] prices15 = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};
        double min15 = prices15[0];
        double max15 = prices15[0];
        for (int i = 1; i < prices15.length; i++) {
            if (prices15[i] < min15) {
                min15 = prices15[i];
            }
            if (prices15[i] > max15) {
                max15 = prices15[i];
            }
        }
        System.out.printf("Розмах: %.2f%n", max15 - min15);

        // Завдання 16
        String[] cities = {"Київ", "Львів", "Харків", "Одеса", "Дніпро"};
        for (String city : cities) {
            System.out.println("Ласкаво просимо до міста " + city + "!");
        }

        // Завдання 17
        double[] salaries17 = {20000.0, 25000.0, 18000.0, 30000.0};
        for (int i = 0; i < salaries17.length; i++) {
            salaries17[i] *= 1.10;
        }
        System.out.println(Arrays.toString(salaries17));

        // Завдання 18
        int[] arr18 = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr18.length / 2; i++) {
            int temp = arr18[i];
            arr18[i] = arr18[arr18.length - 1 - i];
            arr18[arr18.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr18));

        // Завдання 19
        int[] base = {2, 4, 6, 8, 10};
        int[] squares = new int[base.length];
        for (int i = 0; i < base.length; i++) {
            squares[i] = base[i] * base[i];
        }
        System.out.println(Arrays.toString(base));
        System.out.println(Arrays.toString(squares));

        // Завдання 20
        int[] arr20 = {1, 3, 5, 5, 8, 12};
        boolean isSorted = true;
        for (int i = 0; i < arr20.length - 1; i++) {
            if (arr20[i] > arr20[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Відсортований: " + isSorted);

        // Завдання 21
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        System.out.println(Arrays.toString(c));

        // Завдання 22
        int[] test = {45, 12, 89, 3, 27};
        System.out.println(Arrays.toString(test));
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        Arrays.fill(test, -1);
        System.out.println(Arrays.toString(test));

        // Завдання 23
        int[][] table = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                table[row][col] = row * 3 + col + 1;
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
        }

        // Завдання 24
        int[][] matrix24 = {
                {10, 20, 30, 40},
                {50, 60, 70, 80}
        };
        System.out.println("Рядків: " + matrix24.length);
        System.out.println("Стовпчиків: " + matrix24[0].length);
        System.out.println("Лівий верхній: " + matrix24[0][0]);
        System.out.println("Правий верхній: " + matrix24[0][3]);
        System.out.println("Лівий нижній: " + matrix24[1][0]);
        System.out.println("Правий нижній: " + matrix24[1][3]);

        // Завдання 25
        int[][] grid = new int[3][4];
        int counter = 1;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                grid[row][col] = counter;
                counter++;
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }

        // Завдання 26
        int[][] randomGrid = new int[4][3];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                randomGrid[row][col] = (int) (Math.random() * 90) + 10;
            }
        }
        System.out.println(Arrays.deepToString(randomGrid));
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(randomGrid[row][col] + "\t");
            }
            System.out.println();
        }

        // Завдання 27
        int[][] multTable = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                multTable[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(multTable[i][j] + "\t");
            }
            System.out.println();
        }

        // Завдання 28
        int[][] identity = new int[5][5];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (row == col) {
                    identity[row][col] = 1;
                } else {
                    identity[row][col] = 0;
                }
            }
        }
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(identity[row][col] + " ");
            }
            System.out.println();
        }

        // Завдання 29
        int[][] m29 = new int[4][4];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                m29[row][col] = 1;
            }
        }
        for (int col = 0; col < 4; col++) {
            m29[1][col] = 0;
        }
        for (int row = 0; row < 4; row++) {
            m29[row][2] = 7;
        }
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(m29[row][col] + " ");
            }
            System.out.println();
        }

        // Завдання 30
        int[][] m30 = {
                {4, 8, 15},
                {16, 23, 42},
                {1, 2, 3}
        };
        int sum30 = 0;
        int count30 = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                sum30 += m30[row][col];
                count30++;
            }
        }
        double avg30 = (double) sum30 / count30;
        System.out.println("Сума: " + sum30);
        System.out.println("Кількість елементів: " + count30);
        System.out.println("Середнє: " + avg30);

        // Завдання 31
        int[][] m31 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] rowSums = new int[3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                rowSums[row] += m31[row][col];
            }
        }
        for (int row = 0; row < 3; row++) {
            System.out.println("Рядок " + row + ": сума = " + rowSums[row]);
        }

        // Завдання 32
        int[][] m32 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] colSums = new int[3];
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                colSums[col] += m32[row][col];
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(m32[row][col] + "\t");
            }
            System.out.println();
        }
        for (int col = 0; col < 3; col++) {
            System.out.print(colSums[col] + "\t");
        }
        System.out.println();

        // Завдання 33
        int[][] m33 = {
                {-5, 12, 3, 0},
                {7, -20, 45, 8},
                {19, 2, -1, 33}
        };
        int max33 = m33[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if (m33[row][col] > max33) {
                    max33 = m33[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        System.out.println("Максимум: " + max33 + " у комірці [" + maxRow + ", " + maxCol + "]");

        // Завдання 34
        int[][] m34 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int mainSum = 0;
        int antiSum = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row == col) {
                    mainSum += m34[row][col];
                }
                if (row + col == m34.length - 1) {
                    antiSum += m34[row][col];
                }
            }
        }
        System.out.println("Головна діагональ: " + mainSum);
        System.out.println("Побічна діагональ: " + antiSum);
        if (mainSum > antiSum) {
            System.out.println("Головна більша");
        } else if (mainSum < antiSum) {
            System.out.println("Побічна більша");
        } else {
            System.out.println("Суми рівні");
        }

        // Завдання 35
        int[][] matrix35 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transposed = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposed[j][i] = matrix35[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix35[i][j] + " ");
            }
            System.out.print("\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

        // Завдання 36
        int[][] ladder = new int[4][];
        for (int i = 0; i < 4; i++) {
            ladder[i] = new int[i + 1];
            for (int j = 0; j < ladder[i].length; j++) {
                ladder[i][j] = i;
            }
        }
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                System.out.print(ladder[i][j] + " ");
            }
            System.out.println();
        }

        // Завдання 37
        String[][] weekSchedule = new String[5][];
        weekSchedule[0] = new String[]{"Вища математика", "Основи програмування", "Фізика"};
        weekSchedule[1] = new String[]{"Англійська мова", "Історія України"};
        weekSchedule[2] = new String[]{"Основи програмування", "Основи програмування", "Бази даних", "Фізвиховання"};
        weekSchedule[3] = new String[]{"Дискретна математика"};
        weekSchedule[4] = new String[]{"Філософія", "Основи алгоритмізації", "Практикум"};
        String[] dayNames = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця"};
        for (int i = 0; i < weekSchedule.length; i++) {
            System.out.println(dayNames[i] + " (пар: " + weekSchedule[i].length + "):");
            for (int j = 0; j < weekSchedule[i].length; j++) {
                System.out.println("  " + weekSchedule[i][j]);
            }
        }

        // Завдання 38
        int[][] pascal = new int[5][];
        for (int i = 0; i < 5; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }

        // Завдання 39
        int[][][] cube = new int[3][3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    cube[x][y][z] = x + y + z;
                }
            }
        }
        for (int x = 0; x < 3; x++) {
            System.out.println("--- Шар " + x + " ---");
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    System.out.print(cube[x][y][z] + "\t");
                }
                System.out.println();
            }
        }

        // Завдання 40
        double[][][] weather = {
                {{18, 9}, {20, 11}, {21, 12}, {19, 10}, {17, 8}, {16, 7}, {18, 9}},
                {{16, 7}, {17, 8}, {19, 9}, {18, 8}, {15, 5}, {14, 4}, {16, 6}},
                {{22, 14}, {23, 15}, {24, 16}, {22, 13}, {21, 12}, {20, 12}, {22, 14}}
        };
        String[] cityNames = {"Київ", "Львів", "Одеса"};
        for (int city = 0; city < 3; city++) {
            double daySum = 0;
            for (int day = 0; day < 7; day++) {
                daySum += weather[city][day][0];
            }
            System.out.println(cityNames[city] + ": середня денна температура = " + daySum / 7);
        }
        double coldestNight = weather[0][0][1];
        for (int city = 0; city < 3; city++) {
            for (int day = 0; day < 7; day++) {
                if (weather[city][day][1] < coldestNight) {
                    coldestNight = weather[city][day][1];
                }
            }
        }
        System.out.println("Найхолодніша ніч: " + coldestNight);
    }
}