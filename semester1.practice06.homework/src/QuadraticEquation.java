class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public void setCoefficients(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Увага: коефіцієнт 'a' не може дорівнювати 0 (це лінійне рівняння)!");
            a = 1.0;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }
        public boolean hasRealRoots() {
            return getDiscriminant() >= 0;
        }
        public double getRoot1() {
        double d = getDiscriminant();
            if (d< 0) {
                return Double.NaN;
            }
            return (-b + Math.sqrt(d)) / (2 * a);

        }
        public double getRoot2() {
        double d = getDiscriminant();
        if (d < 0) {
            return Double.NaN;
        }
        return  (-b - Math.sqrt(d)) / (2 * a);
        }
        public void printSolution() {
        System.out.println("Рівняння: " + a + "*x^2 + " + b + "*x + " + c + " = 0");
        double d = getDiscriminant();
        System.out.println("Дискримінант D = " + d);
        if (d > 0) {
            System.out.println("Рівняння має 2 дійсні корені: ");
            System.out.println("x1 = " + getRoot1());
            System.out.println("x2 = " + getRoot2());
        }else if (d == 0) {
            System.out.println("Рівняння має один дійсний корінь:");
            System.out.println("x = " + (-b / (2 * a)));
        }else {
            System.out.println("Рівняння не має дійсних коренів (D < 0)");
        }
        }
        }



