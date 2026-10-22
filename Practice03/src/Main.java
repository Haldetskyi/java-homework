import java.util.Locale;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть прізвище: ");
        String lastName = scanner.nextLine();
        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть місто проживання: ");
        String city = scanner.nextLine();
        System.out.println("=== ВХІДНІ ДАНІ ===");
        System.out.println("Ім'я: " + name);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Вік: " + age);
        System.out.println("Місто: " + city);
        System.out.println("-------------------");
        System.out.println("Привіт, " + name + " " + lastName + " з міста " + city + "! Твій вік: " + age + " р.");
        //Завдання 2
        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();
        int sum = a + b;
        int difference = a - b;
        int dobytok = a * b;
        int remainder = a % b;
        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + difference);
        System.out.println("Добуток: " + dobytok);
        System.out.println("Остача від ділення: " + remainder);
        //Завдання 3
        System.out.print("Введіть суму в гривнях (UAH): ");
        double UAH = scanner.nextDouble();
        System.out.print("Введіть курс USD: ");
        double rate = scanner.nextDouble();
        double dollars = UAH / rate;
        System.out.printf("Сума до видачі: %.2f USD", dollars);
        //Завдання 4
        System.out.print("\n" + "Введіть номер квитка: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть повне ім'я студента: ");
        String name1 = scanner.nextLine();
        System.out.print("Введіть спеціальність: ");
        String speciality = scanner.nextLine();
        System.out.print("Студент: " + name1 + ", " + "квиток:" + "№" + number + ", спеціальність: " + speciality);
        //Завдання 5
        System.out.print("\n" + "Введіть ваш зріст (м): ");
        double height = scanner.nextDouble();
        System.out.print("Введіть вашу вагу (кг): ");
        double weight = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("Розрахований BMI: %.2f", bmi);
        //Завдання 6
        System.out.print("\n" + "Введіть символ: ");
        char ch = scanner.next().charAt(0);
        int code = (int) ch;
        System.out.println("Символ: " + ch + " | Код символу: " + code);
        //Завдання 7
        System.out.print("\n" + "Катет A: ");
        double A = scanner.nextDouble();
        System.out.print("Катет B: ");
        double B = scanner.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        double perimeter = a + b + hypotenuse;
        double area = (a * b) / 2;
        System.out.println("Гіпотенуза: " + hypotenuse);
        System.out.println("Периметр: " + perimeter);
        System.out.println("Площа: " + area);
        //Завдання 8
        System.out.print("Товар: ");
        scanner.nextLine();
        String product = scanner.nextLine();
        System.out.print("Ціна: ");
        double price = scanner.nextDouble();
        System.out.print("Кількість: ");
        int quantity = scanner.nextInt();
        double total = price * quantity;
        double vat = total * 0.20;
        System.out.println("Товар: " + product);
        System.out.println("Ціна: " + price);
        System.out.println("Кількість: " + quantity);
        System.out.printf("Загальна сума: %.1f грн (з них ПДВ 20%%: %.1f грн)", total, vat);
        //Завдання 9
        System.out.print("Введіть число: ");
        int number2 = scanner.nextInt();
        if (number2 > 0) {
            System.out.println("Число додатне.");
        } else if (number2 < 0) {
            System.out.println("Число від'ємне.");
        } else {
            System.out.println("Число дорівнює нулю.");
        }
        //Завдання 10
        System.out.print("Введіть число: ");
        int number3 = scanner.nextInt();
        if (number3 == 0) {
            System.out.println("Число є нулем");
        } else if (number3 % 2 == 0) {
            System.out.println("Число " + number3 + " є парним.");
        } else {
            System.out.println("Число " + number3 + " є непарним.");
        }
        //Завдання 11
        System.out.print("Введіть вік: ");
        int age1 = scanner.nextInt();
        if (age1 < 0 || age1 > 120) {
            System.out.println("Некоректний вік");
        } else if (age1 <= 12) {
            System.out.println("Дитина");
        } else if (age1 <= 17) {
            System.out.println("Підліток");
        } else if (age1 <= 64) {
            System.out.println("Дорослий");
        } else {
            System.out.println("Пенсіонер");
        }
        //Завдання 12
        System.out.println("Введіть бал від 0 до 100: ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Помилка: некоректний бал!");
        } else if (score >= 90) {
            System.out.println("Відмінно(A)");
        } else if (score >= 82) {
            System.out.println("Дуже добре (B)");
        } else if (score >= 74) {
            System.out.println("Добре (C)");
        } else if (score >= 64) {
            System.out.println("Задовільно (D)");
        } else if (score >= 60) {
            System.out.println("Достатньо (E)");
        } else {
            System.out.println("Незадовільно (F)");
        }
        //Завдання 13
        System.out.println("Введіть 3 числа: ");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c = scanner.nextInt();
        int max = a1;
        int min = a1;
        if (b1 > max) {
            max = b1;
        }
        if (c > max) {
            max = c;
        }
        if (b1 < min) {
            min = b1;
        }
        if (c < min) {
            min = c;
        }

        System.out.println("Максимум: " + max);
        System.out.println("Мінімум: " + min);
        //Завдання 14
        System.out.print("Введіть X: ");
        double x = scanner.nextDouble();

        System.out.print("Введіть Y: ");
        double y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться в початку координат.");
        } else if (x == 0) {
            System.out.println("Точка лежить на осі Y.");
        } else if (y == 0) {
            System.out.println("Точка лежить на осі X.");
        } else if (x > 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у I чверті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у II чверті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у III чверті.");
        } else {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у IV чверті.");
        }
        //Завдання 15
        int x1 = 5;
        int y1 = 20;

        if (x1 > 10)
            if (y1 > 10)
                System.out.println("y більше 10");
            else
                System.out.println("y не більше 10"); // Java прив'язує else до найближчого попереднього if, який ще не має свого else
        int x2 = 5;
        int y2 = 20;

        if (x2 > 10) {
            if (y2 > 10) {
                System.out.println("x і y більше 10");
            }
        } else {
            System.out.println("x не більше 10");

        }
        // Завдання 16
        System.out.print("Введіть спожиту електроенергію (кВт·год): ");
        double electricity = scanner.nextDouble();

        double total1;

        if (electricity <= 100) {
            total1 = electricity * 2.64;
        } else {
            double firstPart = 100 * 2.64;
            double secondPart = (electricity - 100) * 4.32;

            total1 = firstPart + secondPart;
        }

        System.out.printf("Сума до сплати: %.2f грн", total1);
        //Завдання 17
        System.out.print("Введіть x: ");
        int x3 = scanner.nextInt();
        System.out.print("Введіть y: ");
        int y3 = scanner.nextInt();
        int max1 = (x3 > y3) ? x3 : y3;
        System.out.println("Більше число: " + max1);
        //Завдання 18
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();
        int abs = (n < 0) ? -n : n;
        System.out.println("Модуль числа: " + abs);
        //Завдання 19
        System.out.print("Введіть число: ");
        int number4 = scanner.nextInt();
        String result = (number4 % 2 == 0) ? "Парне" : "Непарне";
        System.out.println("Результат: " + result);
        //Завдання 20;
        System.out.print("Введіть бал: ");
        int score1 = scanner.nextInt();
        System.out.println("Результат: " + (score1 >= 60 ? "Зараховано" : "Незараховано"));
        //Завдання 21
        System.out.print("Введіть число: ");
        int v = scanner.nextInt();
        String status = (v > 0) ? "Додатне" : (v < 0) ? "Від'ємне" : "Нуль";
        System.out.println("Статус: " + status);
        //Завдання 22
        System.out.print("Сума покупки: ");
        double price1 = scanner.nextDouble();
        double discount = (price1 > 1000) ? 0.10 : 0.02;
        double finalPrice = price1 - (price1 * discount);
        System.out.println("До сплати зі знижкою: " + finalPrice + " грн");
        //Завдання 23
        System.out.print("Введіть ділене a: ");
        int a5 = scanner.nextInt();
        System.out.print("Введіть дільник b: ");
        int b5 = scanner.nextInt();
        System.out.println(b5 != 0 ? "Результат: " + ((double) a5 / b5) : "Помилка: ділення на нуль неможливе!");
        //Завдання 24
        System.out.print("Введіть кількість помилок: ");
        int count = scanner.nextInt();
        String result2 = (count == 1) ? "Знайдено 1 помилку" : "Знайдено " + count + " помилок";
        System.out.println(result2);
        //Завдання 25
        int x5 = 10;
        int divisor = 0;
        if (divisor != 0 && (x5 / divisor > 1)) {
            System.out.println("Успішне ділення");
        } else {
            System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
        }  //Спочатку перевіряється divisor != 0. divisor дорівнює 0,результат false тому x5 / divisor не виконується і ArithmeticException не виникає
        //Завдання 26
        int counter1 = 0;
        int counter2 = 0;
        boolean b12 = false && (++counter1 > 0);
        boolean b13 = false & (++counter2 > 0);
        System.out.println("counter1 = " + counter1);
        System.out.println("counter2 = " + counter2); // && якщо перша частина false то друга не виконується & завжди виконує дві частини
        //Завдання 27
        int number27 = 5;
        if (number > 0 || (10 / 0 == 0)) {
            System.out.println("Умова виконана, аварійне ділення не викликалося!");
        } // Тому що || це "або" якщо перше true друге не виконується
        //Завдання 28
        int counterA = 0;
        int counterB = 0;
        boolean test1 = true || (++counterA > 0);
        boolean test2 = true | (++counterB > 0); // | виконує обі частини в будь-якому випадку.
        //Завдання 29
        System.out.print("Введіть годину");
        int hours = scanner.nextInt();
        System.out.print("Введіть хвилини");
        int minutes = scanner.nextInt();
        boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
        if (isValidTime) {
            System.out.print("Час: " + hours + ":" + minutes);
        } else {
            System.out.println("Помилка.");
        }
        //Завдання 30
        System.out.print("Введіть сторону А");
        int aa = scanner.nextInt();
        System.out.print("Введіть сторону В");
        int bb = scanner.nextInt();
        System.out.print("Введіть сторону C");
        int cc = scanner.nextInt();
        if (aa + bb > cc && aa + cc > bb && cc + bb > aa && aa + cc > bb) {
            System.out.print("Трикутник існує: " + true);
        } else {
            System.out.print("Трикутник існує: " + false);
        }
        //Завдання 31
        System.out.print("Введіть число");
        int n31 = scanner.nextInt();
        boolean isEvenBitwise = (n31 & 1) == 0;
        boolean isEven = (n31 % 2) == 0;
        System.out.println(isEvenBitwise);
        System.out.println(isEven); // n31 % 2 це ділення яке считує чи число парне.Оператор & перевіряє останній двійковий біт числа.
        // Якщо 0 число парне, якщо непарне 1
        // Завдання 32
        System.out.print("PIN-код правильний? true/false: ");
        boolean isPinCorrect = scanner.nextBoolean();
        System.out.print("Картка активна?");
        boolean isCardActive = scanner.nextBoolean();
        System.out.print("Балансу вистачає?");
        boolean hasSufficientBalance = scanner.nextBoolean();
        System.out.print("Добовий лімі перевищено?");
        boolean hasSufficientBalance1 = scanner.nextBoolean();
        System.out.print("Добовий ліміт ПЕРЕВИЩЕНО? ");
        boolean isDailyLimitExceeded = scanner.nextBoolean();
        boolean isTransactionAllowed = isPinCorrect && isCardActive && hasSufficientBalance1 && !isDailyLimitExceeded;
        if (isTransactionAllowed) {
            System.out.println("Транзакція дозволена");
        } else {
            System.out.println("Транзакцію відхилено");
        }
        //Завдання 33
        System.out.print("Введіть номер дня");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Некоректний номер дня");
        }
        //Завдання 34
        System.out.print("Введіть номер дня");
        int day1 = scanner.nextInt();
        switch (day1) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будній (робочий) день");
                break;
            case 6:
            case 7:
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Некоректний номер дня");
        }
        //Завдання 35
        System.out.print("Введіть номер місяця");
        int month = scanner.nextInt();
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };
        if (days == 0) {
            System.out.println("Неіснуючий місяць");
        } else {
            System.out.println("Кількість днів: " + days);
        }
        //Завдання 36
        System.out.print("Введіть місяць");
        String month1 = scanner.nextLine();
        String season = switch (month1) {
            case "грудень", "січень", "лютий" -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень" -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default -> "Некоректна назва місяця";
        };
        System.out.println("Пора року: " + season);
        //Завдання 37
        System.out.println("Оберіть спосіб доставки:");
        System.out.println("1 — Самовивіз");
        System.out.println("2 — Кур'єр");
        System.out.println("3 — Поштомат");
        int deliveryType = scanner.nextInt();
        System.out.print("Введіть вагу товару в кг: ");
        double weight2 = scanner.nextDouble();
        int deliveryPrice = switch (deliveryType) {
            case 1 -> 0;
            case 2 -> {
                if (weight2 > 5) {
                    yield 150;
                } else {
                    yield 90;
                }
            }
            case 3 -> 60;
            default -> -1;
        };
        if (deliveryPrice == -1) {
            System.out.println("Помилка");
        } else {
            System.out.println("Вартість доставки: " + deliveryPrice + " грн");
        }
        //Завдання 38
        System.out.print("Число 1: ");
        double a38 = scanner.nextDouble();
        System.out.print("Оберіть операцію (+, -, *, /):");
        char op = scanner.next().charAt(0);
        System.out.print("Число 2: ");
        double b38 = scanner.nextDouble();
        double result1 = switch (op) {
            case '+' -> a38 + b38;
            case '-' -> a38 - b38;
            case '*' -> a38 * b38;
            case '/' -> {
                if (b38 == 0) {
                    System.out.println("Помилка: Ділення на нуль!");
                    yield Double.NaN;
                } else {
                    yield a38 / b38;
                }
            }
            default -> {
                System.out.println("Некоректна операція!");
                yield Double.NaN;
            }
        };
        if (!Double.isNaN(result1)) {
            System.out.println("Результат: " + result1);
        }
        //Завдання 39
        System.out.print("Введіть команду: ");
        String command = scanner.nextLine(); //  == порівнює посилання на об'єкти, а не текс, для порівняння тексту використовуємо equals() або equalsIgnoreCase().
        if (command.equalsIgnoreCase("start")) {
            System.out.println("Система успішно запущена!");
        }
        switch (command.toLowerCase()) {
            case "start" -> System.out.println("Команда: запуск");
            case "pause" -> System.out.println("Команда: пауза");
            case "stop" -> System.out.println("Команда: зупинка");
            case "exit" -> System.out.println("Команда: вихід");
            default -> System.out.println("Невідома команда");
        }
        //Завдання 40
        System.out.println("================ БАНКОМАТ ================");
        System.out.print("Введіть PIN: ");
        int pin = scanner.nextInt();
        if (pin != 1234) {
            System.out.println("Невірний PIN-код! Роботу завершено.");
            scanner.close();
            return;
        }
        System.out.println("Авторизація успішна!\n");
        double balance = 5000.0;
        System.out.println("Оберіть дію:");
        System.out.println("1 — Перевірити баланс");
        System.out.println("2 — Поповнити рахунок");
        System.out.println("3 — Зняти готівку");
        System.out.println("4 — Завершити роботу");
        System.out.print("Ваш вибір: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Ваш поточний баланс: " + balance + " грн");

            case 2 -> {
                System.out.print("Введіть суму поповнення: ");
                double deposit = scanner.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Рахунок поповнено! Поточний баланс: " + balance + " грн");
                } else {
                    System.out.println("Помилка: Сума поповнення має бути більшою за 0");
                }
            }

            case 3 -> {
                System.out.print("Введіть суму зняття: ");
                double amount = scanner.nextDouble();
                if (amount > 0 && amount <= balance) {
                    double fee = (amount > 1000) ? (amount * 0.01) : 0;
                    if (amount + fee <= balance) {
                        balance -= (amount + fee);
                        System.out.println("Комісія операції: " + fee + " грн");
                        System.out.println("Видано: " + amount + " грн. Залишок на рахунку: " + balance + " грн");
                    } else {
                        System.out.println("Помилка: Недостатньо коштів на рахунку для покриття комісії!");
                    }
                } else {
                    System.out.println("Помилка: Некоректна сума або недостатньо коштів!");
                }
            }
            case 4 -> System.out.println("Дякуємо, що скористалися нашими послугами. Бувайте!");
            default -> System.out.println("Некоректний вибір операції!");
        }
        System.out.println("==========================================");
        scanner.close();
    }
}











