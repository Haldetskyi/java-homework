public class Task2QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("=== РОЗВ'ЯЗУВАЧ КВАДРАТНИХ РІВНЯНЬ ===");

        System.out.println("Тест 1:");
        QuadraticEquation eq1 = new QuadraticEquation();
        eq1.setCoefficients(1, -5, 6);
        eq1.printSolution();
        System.out.println("--------------------------------------");

        System.out.println("Тест 2:");
        QuadraticEquation eq2 = new QuadraticEquation();
        eq2.setCoefficients(1, -4, 4);
        eq2.printSolution();
        System.out.println("--------------------------------------");

        System.out.println("Тест 3:");
        QuadraticEquation eq3 = new QuadraticEquation();
        eq3.setCoefficients(1, 2, 5);
        eq3.printSolution();
        System.out.println("======================================");
    }
}