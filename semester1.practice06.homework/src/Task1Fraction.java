
public class Task1Fraction {
    private int numerator;
    private int denominator;
    public void setValues(int num, int den) {
        if (den == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            denominator = 1;

        }
        if (den < 0) {
            numerator = -num;
            denominator = -den;
        } else {
            numerator = num;
            denominator = den;
        }
    }
        private int gcd ( int a, int b){
            a = Math.abs(a);
            b = Math.abs(b);
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        public void simplify() {
            int g = gcd(numerator, denominator);
            if (g != 0) {
                numerator /= g;
                denominator /= g;
            }
        }
        public double toDecimal() {
            return (double) numerator / denominator;
        }
        public void add(int otherNum, int otherDen) {
            numerator = numerator * otherDen + otherNum * denominator;
            denominator = denominator * otherDen;
            simplify();
        }
        public void printFraction() {
            if (denominator == 1) {
                System.out.print(numerator);
            } else {
                System.out.print(numerator + "/" + denominator);
            }
        }
    public static void main(String[] args) {
        System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");
        Task1Fraction fraction = new Task1Fraction();
        fraction.setValues(8, 12);
        System.out.print("Дріб 1: 8/12 \n Після скорочення: ");
        fraction.simplify();
        fraction.printFraction();
        System.out.println(" (десятковий вигляд: " + fraction.toDecimal() + ")");
        System.out.println("Додаємо дріб 3/4...");
        fraction.add(3, 4);
        System.out.print("Результат додавання: ");
        fraction.printFraction();
        System.out.println(" (десятковий вигляд: " + fraction.toDecimal() + ")");
        System.out.println("=====================================");
        }
    }
