public class Task3TriangleClassifier {
    public static void main(String[] args){
    double a = 3.0;
    double b = 4.0;
    double c = 5.0;
    boolean exists = (a + b > c) && (a + c > b) && (b + c > a);
    boolean equal = (a == b) && (b == c);
    boolean rivno = (a == b) || (a == c) || (b == c);
    boolean pifagor = (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) ||
            (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) ||
            (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2));
        System.out.println("Сторони трикутника: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("--------------------------------------------------");
        System.out.println("Чи існує такий трикутник:      " + exists);
        System.out.println("Чи є рівностороннім:           " + equal);
        System.out.println("Чи є рівнобедреним:            " + rivno);
        System.out.println("Чи є прямокутним:              " + pifagor);
    }
}
