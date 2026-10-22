
public class Practice06 {
    public static void main(String[] args) {
        // Завдання 1
        Student s1 = new Student();
        s1.name = "Денис";
        s1.age = 19;
        s1.gpa = 4.75;
        System.out.println(s1.name + ", " + s1.age + ", " + s1.gpa);
        // Завдання 2
        Car car1 = new Car();
        Car car2 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2021;
        car1.speed = 180;
        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2023;
        car2.speed = 250;
        System.out.println(car1.brand + " " + car1.model + ", " + car1.year + ", " + car1.speed);
        System.out.println(car2.brand + " " + car2.model + ", " + car2.year + ", " + car2.speed);
        if (car1.year > car2.year) {
            System.out.println("Новіший: " + car1.brand);
        } else if (car1.year < car2.year) {
            System.out.println("Новіший: " + car2.brand);
        } else {
            System.out.println("Однакового року");
        }
        // Завдання 3
        Book emptyBook = new Book();
        System.out.println(emptyBook.title);
        System.out.println(emptyBook.author);
        System.out.println(emptyBook.pages);
        System.out.println(emptyBook.isRead);
        // Завдання4
        Rectangle rect = new Rectangle();
        rect.width = 7.5;
        rect.height = 4.0;
        double area4 = rect.width * rect.height;
        double perimeter4 = 2 * (rect.width + rect.height);
        System.out.println("Площа: " + area4 + ", периметр: " + perimeter4);
        //Завдання 5
        Product product = new Product();
        product.name = "Монітор";
        product.price = 6500.0;
        product.quantity = 8;
        double total5 = product.price * product.quantity;
        System.out.println("Вартість партії: " + total5 + " грн");
        // Завдання 6
        Smartphone phone = new Smartphone();
        phone.model = "Galaxy";
        phone.batteryLevel = 100;
        phone.isTurnedOn = true;
        phone.batteryLevel = phone.batteryLevel - 35;
        if (phone.batteryLevel <= 0) {
            phone.isTurnedOn = false;
        }
        System.out.println(phone.model + ", заряд: " + phone.batteryLevel + "%, увімкнено: " + phone.isTurnedOn);
        // Завдання 7
        Point2D pointA = new Point2D();
        pointA.x = 0;
        pointA.y = 0;
        Point2D pointB = new Point2D();
        pointB.x = 3;
        pointB.y = 4;
        double distance = Math.sqrt(Math.pow(pointB.x - pointA.x, 2) + Math.pow(pointB.y - pointA.y, 2));
        System.out.println("Відстань: " + distance);
        // Завдання 8
        Student first = new Student();
        first.name = "Іван";
        Student second = first;
        second.name = "Петро";
        System.out.println(first.name);
        // first і second  це два посилання на один об'єкт у Heap,
        // тому зміна через second змінює той самий об'єкт, і first.name теж стає "Петро"
        // Завдання 9
        Greeter greeter = new Greeter();
        greeter.sayHello();
        greeter.sayHelloTo("Олена");
        // Завдання 10
        Animal cat = new Animal();
        cat.species = "Кіт";
        cat.name = "Мурзик";
        Animal dog = new Animal();
        dog.species = "Собака";
        dog.name = "Бобік";
        cat.makeSound();
        cat.printInfo();
        dog.makeSound();
        dog.printInfo();
        // Завдання 11
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.decrement();
        counter.printCount();
        // Завдання 12
        TrafficLight light = new TrafficLight();
        light.changeColor("Червоний");
        light.showSignal();
        light.changeColor("Жовтий");
        light.showSignal();
        light.changeColor("Зелений");
        light.showSignal();
        // Завдання 13
        Player player = new Player();
        player.nickname = "Hero";
        player.takeDamage(30);
        System.out.println("Здоров'я: " + player.health);
        player.heal(50);
        System.out.println("Здоров'я: " + player.health);
        player.takeDamage(200);
        System.out.println("Здоров'я: " + player.health);
        // Завдання 14
        Lamp lamp = new Lamp();
        lamp.turnOn();
        lamp.status();
        lamp.toggle();
        lamp.status();
        lamp.toggle();
        lamp.status();
        // Завдання 15
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.tick();
        stopwatch.addSeconds(124);
        stopwatch.displayTime();
        // Завдання 16
        Printer printer = new Printer();
        printer.model = "HP";
        printer.paperCount = 10;
        printer.printDocument("Звіт", 6);
        printer.printDocument("Курсова", 8);
        // Завдання 17
        SimpleCalculator calc = new SimpleCalculator();
        int sum17 = calc.add(10, 5);
        int diff17 = calc.subtract(10, 5);
        int prod17 = calc.multiply(10, 5);
        double div17 = calc.divide(10, 4);
        double div17zero = calc.divide(10, 0);
        System.out.println(sum17 + " " + diff17 + " " + prod17 + " " + div17 + " " + div17zero);
        // Завдання 18
        Circle circle = new Circle();
        circle.radius = 5.0;
        System.out.println("Площа: " + circle.getArea());
        System.out.println("Довжина кола: " + circle.getCircumference());
        // Завдання 19
        TemperatureConverter converter = new TemperatureConverter();
        double fahrenheit = converter.celsiusToFahrenheit(25);
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println("25°C = " + fahrenheit + "°F");
        System.out.println(fahrenheit + "°F = " + celsius + "°C");
        // Завдання 20
        NumberChecker checker = new NumberChecker();
        System.out.println("7: парне " + checker.isEven(7) + ", додатне " + checker.isPositive(7) + ", просте " + checker.isPrime(7));
        System.out.println("12: парне " + checker.isEven(12) + ", додатне " + checker.isPositive(12) + ", просте " + checker.isPrime(12));
        System.out.println("-5: парне " + checker.isEven(-5) + ", додатне " + checker.isPositive(-5) + ", просте " + checker.isPrime(-5));
        // Завдання 21
        CurrencyExchange exchange = new CurrencyExchange();
        exchange.usdRate = 41.5;
        double usd = exchange.toUSD(10000);
        System.out.printf("10000 грн = %.2f USD%n", usd);
        System.out.printf("%.2f USD = %.2f грн%n", usd, exchange.toUAH(usd));
        // Завдання 22
        Employee employee = new Employee();
        employee.name = "Андрій";
        employee.baseSalary = 30000;
        employee.bonusPercentage = 15;
        System.out.println("Зарплата: " + employee.calculateTotalSalary());
        System.out.println("Податок: " + employee.calculateTax());
        // Завдання 23
        TextFormatter formatter = new TextFormatter();
        System.out.println(formatter.formatTitle("привіт"));
        System.out.println("Голосних: " + formatter.countVowels("програмування"));
        // Завдання 24
        Triangle triangle = new Triangle();
        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;
        System.out.println("Існує: " + triangle.isValid());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площа: " + triangle.getArea());
        // Завдання 25
        SecretVault vault = new SecretVault();
        // vault.secretCode = "hacked";
        // Помилка компілятора: secretCode has private access in SecretVault
        System.out.println(vault.verifyCode("hacked"));
        System.out.println(vault.verifyCode("Pass123"));
        // Завдання 26
        UserAccount account = new UserAccount();
        account.setCredentials("admin", "1111");
        System.out.println(account.login("admin", "1111"));
        System.out.println(account.login("admin", "0000"));
        account.changePassword("0000", "2222");
        account.changePassword("1111", "2222");
        System.out.println(account.login("admin", "2222"));
        // Завдання 27
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        System.out.println("Баланс: " + bankAccount.getBalance());
        boolean ok = bankAccount.withdraw(5000);
        System.out.println("Зняття 5000: " + ok);
        ok = bankAccount.withdraw(300);
        System.out.println("Зняття 300: " + ok);
        System.out.println("Баланс: " + bankAccount.getBalance());
        // Завдання 28
        Thermometer thermometer = new Thermometer();
        thermometer.setTemperature(20.5);
        System.out.println(thermometer.getTemperature());
        thermometer.setTemperature(-300);
        System.out.println(thermometer.getTemperature());
        // Завдання 29
        CarSpeedometer speedometer = new CarSpeedometer();
        speedometer.accelerate(100);
        System.out.println(speedometer.getSpeed());
        speedometer.accelerate(200);
        System.out.println(speedometer.getSpeed());
        speedometer.brake(100);
        System.out.println(speedometer.getSpeed());
        speedometer.brake(500);
        System.out.println(speedometer.getSpeed());
        // Завдання 30
        Person person1 = new Person();
        person1.setName("Марія");
        person1.setAge(20);
        Person person2 = new Person();
        person2.setName("Олег");
        person2.setAge(200);
        person1.printSummary();
        person2.printSummary();
        // Завдання 31
        DiscountCard card = new DiscountCard();
        card.setOwnerName("Ірина");
        card.addPurchase(3000);
        card.printCardInfo();
        card.addPurchase(4000);
        card.printCardInfo();
        // Завдання 32
        SmartDoorLock doorLock = new SmartDoorLock();
        doorLock.enterPin(1111);
        doorLock.enterPin(2222);
        doorLock.enterPin(3333);
        doorLock.enterPin(1234);
        // Завдання 33
        GradeBook gradeBook = new GradeBook();
        int[] grades = {85, 92, 78, 96, 65};
        gradeBook.setData("Денис", grades);
        System.out.println("Середній: " + gradeBook.getAverage());
        System.out.println("Найвища: " + gradeBook.getHighestGrade());
        System.out.println("Найнижча: " + gradeBook.getLowestGrade());
        // Завдання 34
        ArrayStats stats = new ArrayStats();
        int[] nums34 = {5, 12, 7, 20, 3, 8, 15, 4, 9, 10};
        stats.setNumbers(nums34);
        System.out.println("Парних: " + stats.countEvens());
        System.out.println("Непарних: " + stats.countOdds());
        System.out.println("Сума: " + stats.calculateSum());
        // Завдання 35
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(100.0);
        cart.addItem(250.5);
        cart.addItem(49.5);
        cart.printReceipt();
        System.out.println("Разом: " + cart.getTotalCost());
        cart.applyDiscount(15);
        cart.printReceipt();
        System.out.println("Разом: " + cart.getTotalCost());
        // Завдання 36
        TemperatureTracker tracker = new TemperatureTracker();
        double[] temps36 = {18, 21, 15, 24, 13, 27, 20};
        tracker.setTemps(temps36);
        System.out.println("Днів вище 20: " + tracker.countDaysAbove(20));
        tracker.printWeeklyReport();
        // Завдання 37
        ArraySearcher searcher = new ArraySearcher();
        int[] data37 = {4, 8, 15, 16, 23, 42};
        searcher.setData(data37);
        System.out.println(searcher.contains(15));
        System.out.println(searcher.findIndex(15));
        System.out.println(searcher.contains(99));
        System.out.println(searcher.findIndex(99));
        // Завдання 38
        Vector3D vector = new Vector3D();
        vector.setCoords(2, 3, 6);
        System.out.println("Довжина: " + vector.getMagnitude());
        vector.multiplyByScalar(2);
        vector.printVector();
        // Завдання 39
        Matrix2D matrix2D = new Matrix2D();
        int[][] grid39 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        matrix2D.setGrid(grid39);
        matrix2D.printMatrix();
        System.out.println("Сума всіх: " + matrix2D.getTotalSum());
        System.out.println("Сума рядка 1: " + matrix2D.getRowSum(1));

        // Завдання 40
        MatrixDiagonals diagonals = new MatrixDiagonals();
        int[][] matrix40 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        diagonals.setMatrix(matrix40);
        System.out.println("Головна: " + diagonals.getMainDiagonalSum());
        System.out.println("Побічна: " + diagonals.getAntiDiagonalSum());
        System.out.println("Симетричні: " + diagonals.isDiagonalSymmetric());
    }
}

// Завдання 1, 8
class Student {
    public String name;
    public int age;
    public double gpa;
}

// Завдання 2
class Car {
    public String brand;
    public String model;
    public int year;
    public int speed;
}

// Завдання 3
class Book {
    public String title;
    public String author;
    public int pages;
    public boolean isRead;
}

// Завдання 4
class Rectangle {
    public double width;
    public double height;
}

// Завдання 5
class Product {
    public String name;
    public double price;
    public int quantity;
}

// Завдання 6
class Smartphone {
    public String model;
    public int batteryLevel;
    public boolean isTurnedOn;
}

// Завдання 7
class Point2D {
    public double x;
    public double y;
}

// Завдання 9
class Greeter {
    public void sayHello() {
        System.out.println("Привіт усім!");
    }

    public void sayHelloTo(String name) {
        System.out.println("Привіт, " + name + "! Раді тебе бачити.");
    }
}

// Завдання 10
class Animal {
    public String species;
    public String name;

    public void makeSound() {
        System.out.println(name + " видає звук!");
    }

    public void printInfo() {
        System.out.println("Вид: " + species + ", кличка: " + name);
    }
}

// Завдання 11
class Counter {
    public int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void reset() {
        count = 0;
    }

    public void printCount() {
        System.out.println("Лічильник: " + count);
    }
}

// Завдання 12
class TrafficLight {
    public String currentColor;

    public void changeColor(String newColor) {
        currentColor = newColor;
    }

    public void showSignal() {
        if (currentColor.equals("Червоний")) {
            System.out.println("Стій!");
        } else if (currentColor.equals("Жовтий")) {
            System.out.println("Увага!");
        } else if (currentColor.equals("Зелений")) {
            System.out.println("Їдь!");
        }
    }
}

// Завдання 13
class Player {
    public String nickname;
    public int health = 100;

    public void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) {
            health = 0;
            System.out.println(nickname + " загинув!");
        }
    }

    public void heal(int amount) {
        health = health + amount;
        if (health > 100) {
            health = 100;
        }
    }
}

// Завдання 14
class Lamp {
    public boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void toggle() {
        isOn = !isOn;
    }

    public void status() {
        if (isOn) {
            System.out.println("Лампа світить");
        } else {
            System.out.println("Лампа вимкнена");
        }
    }
}

// Завдання 15
class Stopwatch {
    public int seconds;

    public void tick() {
        seconds++;
    }

    public void addSeconds(int s) {
        seconds += s;
    }

    public void displayTime() {
        int minutes = seconds / 60;
        int sec = seconds % 60;
        System.out.printf("%02d:%02d%n", minutes, sec);
    }
}

// Завдання 16
class Printer {
    public String model;
    public int paperCount;

    public void printDocument(String title, int pages) {
        if (paperCount >= pages) {
            paperCount = paperCount - pages;
            System.out.println("Документ \"" + title + "\" надруковано. Залишилось паперу: " + paperCount);
        } else {
            System.out.println("Помилка: Недостатньо паперу в принтері " + model + "!");
        }
    }
}

// Завдання 17
class SimpleCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Ділити на нуль не можна!");
            return 0.0;
        }
        return (double) a / b;
    }
}

// Завдання 18
class Circle {
    public double radius;

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

// Завдання 19
class TemperatureConverter {
    public double celsiusToFahrenheit(double c) {
        return c * 1.8 + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) / 1.8;
    }
}

// Завдання 20
class NumberChecker {
    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public boolean isPositive(int n) {
        return n > 0;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Завдання 21
class CurrencyExchange {
    public double usdRate;

    public double toUSD(double uah) {
        return uah / usdRate;
    }

    public double toUAH(double usd) {
        return usd * usdRate;
    }
}

// Завдання 22
class Employee {
    public String name;
    public double baseSalary;
    public double bonusPercentage;

    public double calculateTotalSalary() {
        return baseSalary * (1 + bonusPercentage / 100);
    }

    public double calculateTax() {
        return calculateTotalSalary() * 0.195;
    }
}

// Завдання 23
class TextFormatter {
    public String formatTitle(String text) {
        return "*** " + text.toUpperCase() + " ***";
    }

    public int countVowels(String text) {
        String vowels = "аоуеиіяюєїaeiou";
        String lower = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < lower.length(); i++) {
            if (vowels.indexOf(lower.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}

// Завдання 24
class Triangle {
    public double a;
    public double b;
    public double c;

    public boolean isValid() {
        return a + b > c && a + c > b && b + c > a;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        if (!isValid()) {
            return 0.0;
        }
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
// Завдання 25
class SecretVault {
    private String secretCode = "Pass123";

    public boolean verifyCode(String attempt) {
        return secretCode.equals(attempt);
    }
}

// Завдання 26
class UserAccount {
    private String username;
    private String password;

    public void setCredentials(String u, String p) {
        username = u;
        password = p;
    }

    public boolean login(String enteredUser, String enteredPass) {
        return username.equals(enteredUser) && password.equals(enteredPass);
    }

    public void changePassword(String oldPass, String newPass) {
        if (password.equals(oldPass)) {
            password = newPass;
            System.out.println("Пароль змінено");
        } else {
            System.out.println("Старий пароль невірний");
        }
    }
}

// Завдання 27
class BankAccount {
    private String accountNumber;
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}

// Завдання 28
class Thermometer {
    private double temperature;

    public void setTemperature(double t) {
        if (t < -273.15) {
            System.out.println("Помилка: нижче абсолютного нуля!");
        } else {
            temperature = t;
        }
    }

    public double getTemperature() {
        return temperature;
    }
}

// Завдання 29
class CarSpeedometer {
    private int speed = 0;

    public void accelerate(int delta) {
        speed += delta;
        if (speed > 240) {
            speed = 240;
        }
    }

    public void brake(int delta) {
        speed -= delta;
        if (speed < 0) {
            speed = 0;
        }
    }

    public int getSpeed() {
        return speed;
    }
}

// Завдання 30
class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Помилка: некоректний вік " + age);
        }
    }

    public void printSummary() {
        System.out.println(name + ", вік: " + age);
    }
}

// Завдання 31
class DiscountCard {
    private String ownerName;
    private double totalSpent;
    private int discountPercent;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addPurchase(double cost) {
        totalSpent += cost;
        if (totalSpent >= 10000) {
            discountPercent = 10;
        } else if (totalSpent >= 5000) {
            discountPercent = 5;
        } else {
            discountPercent = 1;
        }
    }

    public void printCardInfo() {
        System.out.println(ownerName + ": витрачено " + totalSpent + " грн, знижка " + discountPercent + "%");
    }
}

// Завдання 32
class SmartDoorLock {
    private int pinCode = 1234;
    private boolean isLocked = true;
    private int failedAttempts = 0;

    public void enterPin(int enteredPin) {
        if (failedAttempts >= 3) {
            System.out.println("СИСТЕМА ЗАБЛОКОВАНА! Викличте охорону.");
        } else if (enteredPin == pinCode) {
            isLocked = false;
            failedAttempts = 0;
            System.out.println("Замок відчинено");
        } else {
            failedAttempts++;
            System.out.println("Невірний PIN. Спроб: " + failedAttempts);
        }
    }
}

// Завдання 33
class GradeBook {
    private String studentName;
    private int[] grades;

    public void setData(String name, int[] g) {
        studentName = name;
        grades = g;
    }

    public double getAverage() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (double) sum / grades.length;
    }

    public int getHighestGrade() {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    public int getLowestGrade() {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }
}

// Завдання 34
class ArrayStats {
    private int[] numbers;

    public void setNumbers(int[] nums) {
        numbers = nums;
    }

    public int countEvens() {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int countOdds() {
        return numbers.length - countEvens();
    }

    public int calculateSum() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}

// Завдання 35
class ShoppingCart {
    private double[] itemPrices = new double[10];
    private int count = 0;

    public void addItem(double price) {
        if (count < itemPrices.length) {
            itemPrices[count] = price;
            count++;
        } else {
            System.out.println("Кошик повний!");
        }
    }

    public double getTotalCost() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += itemPrices[i];
        }
        return sum;
    }

    public void applyDiscount(double percent) {
        for (int i = 0; i < count; i++) {
            itemPrices[i] = itemPrices[i] * (1 - percent / 100);
        }
    }

    public void printReceipt() {
        System.out.println("--- Чек ---");
        for (int i = 0; i < count; i++) {
            System.out.println("Товар " + (i + 1) + ": " + itemPrices[i]);
        }
    }
}

// Завдання 36
class TemperatureTracker {
    private double[] dailyTemps = new double[7];

    public void setTemps(double[] temps) {
        dailyTemps = temps;
    }

    public int countDaysAbove(double threshold) {
        int count = 0;
        for (int i = 0; i < dailyTemps.length; i++) {
            if (dailyTemps[i] > threshold) {
                count++;
            }
        }
        return count;
    }

    public void printWeeklyReport() {
        int maxIndex = 0;
        for (int i = 0; i < dailyTemps.length; i++) {
            System.out.println("День " + (i + 1) + ": " + dailyTemps[i]);
            if (dailyTemps[i] > dailyTemps[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Найтепліший день: " + (maxIndex + 1) + " (" + dailyTemps[maxIndex] + ")");
    }
}

// Завдання 37
class ArraySearcher {
    private int[] data;

    public void setData(int[] data) {
        this.data = data;
    }

    public boolean contains(int target) {
        return findIndex(target) != -1;
    }

    public int findIndex(int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

// Завдання 38
class Vector3D {
    private double[] coords = new double[3];

    public void setCoords(double x, double y, double z) {
        coords[0] = x;
        coords[1] = y;
        coords[2] = z;
    }

    public double getMagnitude() {
        return Math.sqrt(coords[0] * coords[0] + coords[1] * coords[1] + coords[2] * coords[2]);
    }

    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < coords.length; i++) {
            coords[i] = coords[i] * scalar;
        }
    }

    public void printVector() {
        System.out.println("(" + coords[0] + ", " + coords[1] + ", " + coords[2] + ")");
    }
}

// Завдання 39
class Matrix2D {
    private int[][] grid;

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void printMatrix() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public int getTotalSum() {
        int sum = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                sum += grid[row][col];
            }
        }
        return sum;
    }

    public int getRowSum(int rowIndex) {
        int sum = 0;
        for (int col = 0; col < grid[rowIndex].length; col++) {
            sum += grid[rowIndex][col];
        }
        return sum;
    }
}

// Завдання 40
class MatrixDiagonals {
    private int[][] matrix;

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getMainDiagonalSum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public int getAntiDiagonalSum() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    public boolean isDiagonalSymmetric() {
        return getMainDiagonalSum() == getAntiDiagonalSum();
    }
}