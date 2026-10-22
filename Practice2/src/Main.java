//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 19;
        double height = 1.86;
        char firstLetter = 'S';
        boolean isStudent = true;
        System.out.println(age);
        System.out.println(height);
        System.out.println(firstLetter);
        System.out.println(isStudent);
        // Завдання 2
        byte temperature = -15;
        short currentYear = 2026;
        int cityPopulation = 1200000;
        long worldPopulation = 8100000000L;
        System.out.println();
        System.out.println(temperature);
        System.out.println(currentYear);
        System.out.println(cityPopulation);
        System.out.println(worldPopulation);
        // Завдання 3
        float floatValue = 1.1234567f;
        double doubleValue = 1.123456789012345;
        System.out.println();
        System.out.println(floatValue + "\n" + doubleValue);
        //Завдання 4
        char symbol1 = 'J';
        char symbol2 = 74;
        char symbol3 = '\u004A';
        System.out.println(symbol1 + "\n" + symbol2 + "\n" + symbol3);
        //Завдання 5
        boolean isJavaFun = true;
        boolean isFishFly = false;
        boolean isSkyBlue = true;

        System.out.println(isJavaFun + "\n" + isFishFly + "\n" + isSkyBlue);
        //Завдання 6
        final double GRAVITY = 9.81; // GRAVITY = 10.0; Значеня final не можна змінювати
        final int DAYS_IN_WEEK = 7;
        final String UNIVERSITY_NAME = "Львівська політехніка";
        System.out.println(GRAVITY + "\n" + DAYS_IN_WEEK + "\n" + UNIVERSITY_NAME);
        // Завдання 7
        int intVal = 250;
        double doubleVal = intVal;
        System.out.println("int: " + intVal + "\n" + "double:" + doubleVal);
        // Завдання 8
        double priceWithPennies = 49.99;
        int roundedPrice = (int) priceWithPennies;
        System.out.println(roundedPrice);
        //Завдання 9
        int firstNumber = 5;
        double userWeight = 72.5;
        String userCity = "Kyiv";
        boolean isValidUser = true;
        //Завдання 10
        String firstName = "Тарас";
        String lastName = "Шевченко";
        int age1 = 47;
        System.out.println("Мене звати " + firstName + " " + lastName + ", мені " + age1 + " років.");
        //Завдання 11
        int a = 10;
        int b = 20;
        System.out.println("Сума без дужок: " + a + b); // У першому випадку Java спочатку почала працювати з текстом, тому + a + b просто з'єднується
        System.out.println("Сума з дужками: " + (a + b)); // У другому дужки змушують Java спочатку додати числа
        //Завдання 12
        String login = "ivan.petrenko";
        String domain = "gmail.com";
        String role = "student";
        String email = login + "@" + domain;
        System.out.println("Користувач " + login + " (роль: " + role + ") має пошту: " + email);
        //Завдання 13
        String productName = "Ноутбук";
        int quanity = 2;
        double pricePerUnir = 24500.50;
        System.out.println("ЧЕК:"+"\n"+"Товар: "+productName+"\n"+"Кількість: "+ quanity+"шт."+"\n"+"Ціна: "+pricePerUnir+" грн");
        //Завдання 14
        String currency = "UAH";
        int hryvnias = 1500;
        int kopecks = 75;
        System.out.println("Поточний баланс: "+hryvnias+"."+kopecks+" UAH");
        //Завдання 15
        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;
        System.out.println("Запис відправлено на: "+protocol+host+endpoint+userId);
        //Завдання 16
        String language = "Java";
        int level = 1;
        boolean isReady = true;
        System.out.println("Мова: "+language+" |"+" Рівень: "+level+" |"+" Готовінсть до практики: "+ isReady);
        //Завдання 17
        int number = 19;
        int remainder = number % 2;
        System.out.println("Число 19 при діленні на 2 дає остачу: "+remainder);
        //Завдання 18
        int totalSeconds = 385;
        int r = totalSeconds / 60;
        int i = totalSeconds % 60;
        System.out.println("385 секунд = "+r+" хв "+i+" сек");
        //Завдання19
        int n = 47;
        int q = n / 10;
        int w = n % 10;
        int sum = q + w;
        System.out.println("Число: "+n+"."+" Десятки: "+q+","+" Одиниці: "+w+"."+" Сума цифр: "+sum);
        //Завдання20
        int score = 100;
        int score1 = score += 50;
        int score2 = score1 -= 20;
        int score3 = score2 *= 2;
        int score4 = score3 /= 4;
        System.out.println("Очікуваний результат:"+"\n"+"Після додавання: "+score1+"\n"+"Після віднімання: "+score2+"\n"+"Після множення: "+score3+"\n"+"Після ділення: "+score4);
        //Завдання21
        int counter = 5;
        System.out.println(counter++); // Томущо з ++ спочатку виводится старе значення, потім +1
        System.out.println(counter);
        System.out.println();
        //Завдання22
        int counter1 = 5;
        System.out.println(++counter1); // Спочатку збільшує, потім показує
        //Завдання23
        int grade1 = 4;
        int grade2 = 5;
        int grade3 = 4;
        double average = (grade1 + grade2 + grade3) / 3.0;
        System.out.println("Середній бал: " + average );
        //Завдання24
        double celsius = 25.0;
        double fah = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;
        System.out.println(celsius+"°C = "+fah+"°F"+"\n"+celsius+"°C = "+kelvin+" K");
        //Завдання25
        int userAge = 17;
        boolean isAdult = userAge >= 18;
        System.out.println("Вік: " + userAge + ". Чи є повнолітнім: " + isAdult);
        //Завдання26
        int x = 15;
        int y = 20;
        System.out.println("Чи рівні числа: " + (x == y));
        System.out.println("Чи не рівні: " + (x != y));
        System.out.println("Чи x більше за y: " + (x > y));
        //Завдання27
        int speed = 75;
        boolean isSafeSpeed = (speed >= 20) && (speed <=80);
        System.out.println(isSafeSpeed);
        //Завдання28
        int personAge = 70;
        boolean hasFreePass = (personAge < 7) || (personAge >= 65);
        System.out.println("Вік: " + personAge +
                ". Право на безкоштовний проїзд: " + hasFreePass);
        //Завдання29
        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;
        System.out.println("Двері зачинені: " + isDoorLocked);
        System.out.println("Чи можна увійти: " + canEnter);
        //Завдання30
        int number1 = 30;
        boolean isDivisibleByBoth = (number1 % 3 == 0) && (number1 % 5 == 0);
        System.out.println(isDivisibleByBoth);
        int number2 = 25;
        boolean isDivisibleByBoth1 = (number2 % 3 == 0) && (number2 % 5 == 0);
        System.out.println(isDivisibleByBoth1);
        //Завдання31
        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;

        System.out.println(canLogin);
        //Завдання32
        int year = 2024;
        boolean isLeapYear =
                (year % 4 == 0 && year % 100 != 0)
                        || (year % 400 == 0);
        System.out.println(isLeapYear);
        //Завдання33
        double v = 3.0;
        double d = 4.0;
        double m = Math.sqrt(Math.pow(v, 2)+ Math.pow(d, 2));
        System.out.println("Катети: " + v + " та " + d + ". Гіпотенуза: " + m);
        System.out.println();
        //Завдання34
        double radius = 5.0;
        double length = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Радіус: " + radius);
        System.out.println("Довжина кола: " + length);
        System.out.println("Площа круга: " + area);
        System.out.println();
        //Завдання35
        double dayTemp = 18.5;
        double nightTemp = -3.2;
        double tempDiff = Math.abs(dayTemp - nightTemp);
        double maxTemp = Math.max(dayTemp, nightTemp);
        double minTemp = Math.min(dayTemp, nightTemp);
        System.out.println("Перепад температури: " + tempDiff);
        System.out.println("Максимальна температура: " + maxTemp);
        System.out.println("Мінімальна температура: " + minTemp);
        System.out.println();
        //Завдання36
        double num = 5.67;
        System.out.println("Для додатного числа " + num + ":");
        System.out.println("Math.round: " + Math.round(num));
        System.out.println("Math.ceil: " + Math.ceil(num));
        System.out.println("Math.floor: " + Math.floor(num));
        double negNum = -5.67;
        System.out.println("Для від'ємного числа " + negNum + ":");
        System.out.println("Math.round: " + Math.round(negNum));
        System.out.println("Math.ceil: " + Math.ceil(negNum));   // Округлює вгору (до 0) -> -5.0
        System.out.println("Math.floor: " + Math.floor(negNum)); // Округлює вниз (від 0) -> -6.0
        System.out.println();
        //Завдання37
        double coefA = 1.0;
        double coefB = -7.0;
        double coefC = 10.0;
        double z = Math.pow(coefB, 2) - 4 * coefA * coefC;
        double x1 = (-coefB + Math.sqrt(z)) / (2 * coefA);
        double x2 = (-coefB - Math.sqrt(z)) / (2 * coefA);
        System.out.println("Дискримінант D = " + z);
        System.out.println("Корінь x1 = " + x1);
        System.out.println("Корінь x2 = " + x2);
        System.out.println();
        //Завдання38
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Випало на кубику: " + dice);
        System.out.println();
        //Завдання39
        int minRange = -10;
        int maxRange = 35;
        int randomTemp = (int) (Math.random() * (maxRange - minRange + 1)) + minRange;
        System.out.println("Погода на завтра: " + randomTemp + "°C");
        System.out.println();
        //Завдання40
        double p = 10000.0;
        double j = 12.0;
        int t = 3;
        double s = p * Math.pow(1 + j / 100, t);
        double profit = s - p;
        System.out.println("+------------------------------------+");
        System.out.println("|      ДЕПОЗИТНИЙ КАЛЬКУЛЯТОР        |");
        System.out.println("+------------------------------------+");
        System.out.println("Початкова сума: " + p + " грн");
        System.out.println("Термін: " + t + " роки під " + r + "% річних");
        System.out.println("Підсумкова сума: " + s + " грн");
        System.out.println("Чистий прибуток: " + profit + " грн");
        System.out.println("+------------------------------------+");



    }




}