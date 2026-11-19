
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1WrapperAndAutoboxingMemory {

    public static void inspectIntegerCache(int[] testValues) {
        System.out.println("[1. ЕКСПЕРИМЕНТ: INTEGER CACHE [-128..127] (== проти .equals())]:");

        for (int val : testValues) {
            Integer first = Integer.valueOf(val);
            Integer second = Integer.valueOf(val);

            boolean sameLink = (first == second);
            boolean sameValue = first.equals(second);

            String source;
            if (sameLink) {
                source = "IntegerCache";
            } else {
                source = "Новий об'єкт у Heap!";
            }

            System.out.printf("  Значення: %5d | (a == b): %-5b | a.equals(b): %-5b | Джерело: %s%n",
                    val, sameLink, sameValue, source);
        }
        System.out.println();
    }

    public static void demonstrateAutoboxingUnderTheHood() {
        System.out.println("[2. AUTOBOXING / UNBOXING ПІД КАПОТОМ ТА ЗАХИСТ ВІД NULL]:");

        Integer autoInt = 42;
        int autoIntBack = autoInt;
        Integer handInt = Integer.valueOf(42);
        int handIntBack = handInt.intValue();
        System.out.println("  Явне пакування: Integer.valueOf(42) -> " + handInt
                + " | Розпакування: .intValue() -> " + handIntBack);
        System.out.println("  Неявне пакування: Integer x = 42 -> " + autoInt
                + " | Неявне розпакування: int y = x -> " + autoIntBack);

        Double autoDouble = 3.14;
        double autoDoubleBack = autoDouble;
        Double handDouble = Double.valueOf(3.14);
        double handDoubleBack = handDouble.doubleValue();
        System.out.println("  Double: Double.valueOf(3.14) -> " + handDouble
                + " | .doubleValue() -> " + handDoubleBack
                + " | неявно: " + autoDouble + " -> " + autoDoubleBack);

        Boolean autoBool = true;
        boolean autoBoolBack = autoBool;
        Boolean handBool = Boolean.valueOf(true);
        boolean handBoolBack = handBool.booleanValue();
        System.out.println("  Boolean: Boolean.valueOf(true) -> " + handBool
                + " | .booleanValue() -> " + handBoolBack
                + " | неявно: " + autoBool + " -> " + autoBoolBack);

        List<Integer> sensorData = Arrays.asList(45, null, -12, 88, null, 102);
        System.out.println("  Вхідний список із датчиків (з null): " + sensorData);

        int sum = 0;
        String nullPlaces = "";

        for (int i = 0; i < sensorData.size(); i++) {
            Integer element = sensorData.get(i);

            if (element == null) {
                if (nullPlaces.isEmpty()) {
                    nullPlaces = "" + i;
                } else {
                    nullPlaces = nullPlaces + " та " + i;
                }
            } else {
                sum = sum + element.intValue();
            }
        }

        System.out.println("  ⚠️ Пропущено null-елемент на індексі " + nullPlaces
                + " (запобігання NullPointerException при intValue()!)");
        System.out.println("  Сума валідних розпакованих елементів: " + sum);
        System.out.println();
    }

    public static List<Integer> parseTelemetryStream(String[] rawPackets) {
        System.out.println("[3. ПАРСИНГ РЯДКІВ (Integer.parseInt) ТА ЕКСТРЕМУМИ (MAX_VALUE / MIN_VALUE)]:");
        System.out.println("  Початкові межі пошуку: min = " + Integer.MAX_VALUE
                + " (MAX_VALUE), max = " + Integer.MIN_VALUE + " (MIN_VALUE)");

        List<Integer> result = new ArrayList<>();

        for (String packet : rawPackets) {
            if (packet == null) {
                System.out.println("  ❌ Порожній або null-пакет відхилено");
                continue;
            }

            String cleaned = packet.trim();

            if (cleaned.isEmpty()) {
                System.out.println("  ❌ Порожній або null-пакет відхилено");
                continue;
            }

            try {
                int number = Integer.parseInt(cleaned);
                result.add(number);
            } catch (NumberFormatException e) {
                System.out.println("  ❌ Пакет '" + cleaned + "' відхилено (NumberFormatException)");
            }
        }

        return result;
    }

    public static void printExtremesAndStats(List<Integer> validData) {
        System.out.println("  Успішно розпізнаний список Integer: " + validData);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for (Integer value : validData) {
            int number = value;

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            sum = sum + number;
        }

        System.out.println("  Знайдений мінімум: " + min + " | Знайдений максимум: " + max);
        System.out.println("  Сума всіх елементів: " + sum);

        List<Integer> copy1 = new ArrayList<>(validData);
        copy1.remove(0);
        System.out.println("  Після remove(0) (за індексом): " + copy1);

        List<Integer> copy2 = new ArrayList<>(validData);
        copy2.remove(Integer.valueOf(-30));
        System.out.println("  Після remove(Integer.valueOf(-30)) (за значенням): " + copy2);
    }

    public static void main(String[] args) {
        System.out.println("================ ДОСЛІДЖЕННЯ WRAPPER CLASSES ТА INTEGER CACHE ================");

        int[] testValues = {-128, -50, 0, 127, 128, 500, 2026};
        inspectIntegerCache(testValues);

        demonstrateAutoboxingUnderTheHood();

        String[] rawPackets = {"  145 ", "-30", "ERR_404", "980", "", null, "2147483647", "-85"};
        List<Integer> validData = parseTelemetryStream(rawPackets);
        printExtremesAndStats(validData);

        System.out.println("==============================================================================");
    }
}