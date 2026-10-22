import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Завдання 1
        for (int i = 0; i < 7; i++) {
            System.out.println("Java - надійна та кросплатформна мова!");
        }
        //Завдання 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок тексту: ");
        String text = scanner.nextLine();
        System.out.print("Введіть кількість повторень N: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + text);
        }
        //Завдання 3
        int balance = 0;
        for (int month = 1; month <= 12; month++) {
            balance += 500;
            System.out.println("Місяць " + month + ": " + balance + " грн");
        }
        //Завдання 4
        System.out.print("Введіть курс євро: ");
        double rate = scanner.nextDouble();
        for (int euro = 10; euro <= 100; euro += 10) {
            double grn = euro * rate;
            System.out.println(euro + "EUR = " + grn + " грн");

        }
        //Завдання 5
        System.out.print("Введіть ширину рамки ");
        int w = scanner.nextInt();
        for (int i = 0; i < w; i++) {
            System.out.print("=");
        }
        // Завдання 6
        System.out.println("");
        int x6 = 10;
        while (x6 > 0) {
            System.out.println(x6);
            x6--;
        }
        // Завдання 7
        int sum = 0;
        System.out.println("Введіть цілі числа");
        while (true) {
            int x7 = scanner.nextInt();
            if (x7 == 0) {
                break;
            }
            sum += x7;

        }
        System.out.println("Сума: " + sum);
        //Завдання 8
        System.out.print("Введіть М: ");
        int m = scanner.nextInt();
        int two = 2;
        while (two <= m) {
            System.out.println(two);
            two *= 2;
        }
        //Завдання 9
        System.out.print("Введіть число: ");
        int n1 = scanner.nextInt();

        int count = 0;
        int sum2 = 0;

        while (n1 > 0) {
            sum2 += n1 % 10;
            count++;
            n1 = n1 / 10;
        }

        System.out.println("Кількість цифр: " + count);
        System.out.println("Сума цифр: " + sum2);
        // Завдання 10
        System.out.print("Введіть число: ");
        int b = scanner.nextInt();
        int revers = 0;
        while (b > 0) {
            int d = b % 10;
            revers = revers * 10 + d;
            b = b / 10;
        }
        System.out.println("Перевернуте: " + revers);
        // Завдання 11
        System.out.print("Введіть суму: ");
        double s = scanner.nextDouble();
        System.out.print("Введіть річний відсоток: ");
        double p = scanner.nextDouble();
        double capital = s;
        int years = 0;
        while (capital < 2 * s) {
            capital = capital + capital * p / 100;
            years++;
        }
        System.out.println("Через " + years + "р. сума вдвічі");
        System.out.println("Капітал: " + capital);
        // Завдання 12
        System.out.print("Введіть число: ");
        int n2 = scanner.nextInt();
        int d = 2;
        while (n2 % d != 0) {
            d++;
        }
        System.out.println("Найменши дільник: " + d);
        // ЗАвдання 13
        int secret = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int try1 = 0;
        System.out.println("Вгадайте число від 1 до 100: ");
        while (guess != secret) {
            System.out.print("Ваша здогадка: ");
            guess = scanner.nextInt();
            try1++;
            if (guess < secret) {
                System.out.println("Більше!");
            } else if (guess > secret) {
                System.out.println("Меньше!");
            }
        }
        System.out.println("Вгадали! Кількість спроб: " + try1);
        // Завдання 14
        int choice;
        do {
            System.out.println("1. Розпочати нову гру");
            System.out.println("2. Завантажити збереження");
            System.out.println("3. Налаштування");
            System.out.println("0. Вихід");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Нова гра");
                    break;
                case 2:
                    System.out.println("Завантаження");
                    break;
                case 3:
                    System.out.println("Відкрито налаштування");
                    break;
                case 0:
                    System.out.println("Вихід");
                    break;
                default:
                    System.out.println("Помилка");
            }


        } while (choice != 0);
        // Завдання 15
        int age;
        do {
            System.out.println("Ваш вік: ");
            age = scanner.nextInt();
        } while (age < 1 || age > 120);
        System.out.println("Вік підтверджено: " + age);
        // Завдання 16
        int try2 = 0;
        int pin;
        do {
            System.out.println("Введіть пік код: ");
            pin = scanner.nextInt();
            try2++;
            if (pin == 1234) {
                System.out.println("Доступ надано");
                break;
            }
            if (try2 == 3) {
                System.out.println("Карту заблоковано");
            }

        } while (pin != 1234 && try2 < 3);
        // Завдання 17
        char answer;
        do {
            System.out.print("Введіть перше число:");
            double a3 = scanner.nextDouble();
            System.out.print("Друге");
            double b3 = scanner.nextDouble();
            System.out.println("Сума:  " + (a3 + b3));
            System.out.print("Бажаєте продовжити? (y/n):");
            answer = scanner.next().charAt(0);
        } while (answer == 'y');
        System.out.println("Роботу завершено");
        //Завдання 18
        int dice1;
        int dice2;
        int try3 = 0;
        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            try3++;
            System.out.println("Спроба: " + try3 + " кубик 1 та 2: " + dice1 + " " + dice2);
        } while (dice1 != dice2);
        System.out.println("Дубль випав");
        System.out.println("Спроби: " + try3);
        // Завдання 19
        double znamenik;
        System.out.print("Введіть чисельник: ");
        double chiselnik = scanner.nextDouble();
        do {
            System.out.print("Введіть знаменник: ");
            znamenik = scanner.nextDouble();
        } while (znamenik == 0);
        double result = znamenik / chiselnik;
        System.out.println("Результат: " + result);
        // Завдання 20
        int score;
        int sum1 = 0;
        int count1 = 0;
        do {
            System.out.print("Введіть бал (0-100, від'ємне число - стоп):");
            score = scanner.nextInt();
            if (score > 100) {
                System.out.println("некоректний бал");
            } else if (score >= 0) {
                sum1 += score;
                count1++;
            }
        }while (score >= 0);
        double average = (double)sum1 / count1;
        System.out.println("Середній бал: " + average);
        // Завдання 21
        System.out.print("Введіть А ");
        int A = scanner.nextInt();
        System.out.println("Введіть В ");
        int B = scanner.nextInt();
        System.out.print("Парні числа: ");
        for (int i = A; i<=B;i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // ЗАвдання 22
        System.out.print("Введіть N до 20 ");
        int f = scanner.nextInt();
        long res = 1;
        for (int z =1; z<=f; z++) {
            res = res * z;
        }
        System.out.println(f + "! = " + res);
         // Завдання 23
        System.out.printf("-10%s | -10%s | %-10s%n", "Число", "Квадрат", "Куб");
        for (int v = 1; v <= 10; v++) {
            int square = v * v;
            int cube = v * v * v;
            System.out.printf("%-10d | %-10d | %-10d%n", v, square, cube);
        }
    // Завдання 24
    for (int q = 1; q<= 50; q++){
        if (q % 3==0 || q % 5==0){
            continue;}
        System.out.print(q + " ");
        }
    // Завдання 25
        for (int h = 100; h<=200;h++){
            if (h %13 == 0 && h %7 == 0){
                System.out.print(h );
                break;}
            }
        //Завдання 26
        for (char letter = 'A'; letter<='Z';letter++){
            System.out.println(letter + "= "+ (int) letter);
        }
        //Завдання 27
        System.out.print("Введіть N: ");
        int N = scanner.nextInt();
        int suM = 0;
        for (int I = 1;I <= N;I++){
            if (I % 2 == 1) {
                suM += I;
            }else {
                sum -= I;
            }
        }
        System.out.println("Сума: " + suM);
        // Завдання 28
        System.out.print("Введіть перший член: ");
        int a1 = scanner.nextInt();
        System.out.print("Введіть різницю: ");
        int d1 = scanner.nextInt();
        System.out.print("Введіть кількість членів: ");
        int N1 = scanner.nextInt();
        int d2 = a1;
        int sum3 = 0;
        System.out.print("Члени прогресії: ");
        for (int i2 = 1; i2 <=N1; i2++){
            System.out.print(d2 + " ");
            sum3 += d2;
            d2 += d1;
        }
        System.out.println();
        System.out.println("Сума: " + sum3);
        //Завдання 29
        byte b2 = 125;
        for (int ii = 1; ii <=6;ii++){
            b2 = (byte) (b2 + 1);
            System.out.println("Крок: " + ii + " b2 = " + b2);
            //Значення byte від -128 до 127, якщо додати до 127 то він почнеться с початку, тобто -128,-127,-126.
        }
        // Завдання 30
        System.out.print("Введіть N: ");
        int n3 = scanner.nextInt();
        int sum4 = 0;
        for (int Ii = 1; Ii <= n3; Ii++) {
            System.out.print("Введіть число " + Ii);
            sum4 += scanner.nextInt();
        }
        double round = (double) sum4 / n3;
        double not = sum / n3;
        System.out.println("З приведенням (double) sum / n: " + round);
        System.out.println("Без приведення sum / n: " + not);
        // без (double) відкидає дробову частину
        // Завдання 31
        System.out.print("Введіть слово з 5 символів: ");
        String text1 = scanner.nextLine();
        String result2 = "";
        for (int iii = 0; iii < text1.length();iii++){
            char ch = text1.charAt(iii);
            char newChar = (char) (ch + 1);
            result2 += newChar;
        }
        System.out.println("Шифр: " + result2);
        // Завдання 32
        int grn = 0;
        int kopiyky = 0;
        {
            System.out.print("Введіть 5 цінників: ");
            double price = scanner.nextDouble();
            int whole = (int) price;
            int cents = (int) Math.round((price - whole) * 100);
            grn += whole;
            kopiyky += cents;
        System.out.println("Сума цілих гривень: " + grn);
        System.out.println("Сума копійок: " + kopiyky + " коп. (" + kopiyky / 100.0 + " грн)");
        }
    // Завдання 33
        for (int i33 = 1; i33 <= 50;i33++) {
            int percentage = (int) (((double) i33 / 50) * 100);
            System.out.println("Завантажено: " + percentage + "%");

        }
        // Завдання 34
        long bigNumber = 3_000_000_000L;
        int result67 = (int) bigNumber;
        System.out.println("Початкове число: " + bigNumber);
        System.out.println("Після приведення до int: " + result67);
        // int може тримати до 2147483647, а в нас надто велике число
        // ЗАвдання 35
        for (double d3 = 0.0; d3 <= 1.0; d3 += 0.1){
            System.out.println(d3);
        }
        System.out.println();
        System.out.println("int: ");
        for (int i34 = 0; i34 <= 10; i34++){
            double val = i34 / 10.0;
            System.out.println(val);
        }
    // Завдання 36
    for (int i36 = 1; i36 <= 10; i36++) {
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%10d", i36 * j);
        }
    }
    System.out.println();
    //ЗАвдання 37
        System.out.print("Введіть висоту: ");
        int H = scanner.nextInt();
        System.out.print("Введіть ширину: ");
        int W = scanner.nextInt();

        for (int i37 = 1; i37 <= H; i37++) {
            for (int j37 = 1; j37 <= W; j37++) {
                if (i37 == 1 || i37 == H || j37 == 1 || j37 == W) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Завдання 38
        System.out.print("Висота N: ");
        int n24 = scanner.nextInt();

        for (int i = 1; i <= n24; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Завдання 39
        System.out.print("Введіть N: ");
        int n5 = scanner.nextInt();
        for (int i = 2; i <= n5; i++) {
            boolean common = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    common = false;
                    break;
                }
            }
            if (common) {
                System.out.print(i + " ");
            }
        }
        // Завдання 40
        System.out.print("Розмір N: ");
        int n23 = scanner.nextInt();

        for (int i = 0; i < n23; i++) {
            for (int j = 0; j < n23; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
        }
    }



















