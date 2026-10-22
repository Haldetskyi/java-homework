public class Task2WarehouseInventory {
    public static void main(String[] args) {
        String[] items = {"Ноутбук", "Смартфон", "Бездротові навушники", "Механічна клавіатура", "Монітор 27\""};
        int[] quantities = {8, 3, 25, 4, 12};
        double[] prices = {28500.0, 19200.0, 1850.0, 3100.0, 9400.0};
        double[] totalValues = new double[items.length];
        for (int i = 0; i < items.length; i++) {
            totalValues[i] = quantities[i] * prices[i];
        }
        System.out.println("=================== ЗВІТ СКЛАДУ ЕЛЕКТРОНІКИ ===================");
        System.out.println("№ | Назва товару | К-сть | Ціна (грн) | Загальна вартість");
        System.out.println("----------------------------------------------------------------");

        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + " | " + items[i] + " | " + quantities[i] + " шт. | "
                    + prices[i] + " | " + totalValues[i] + " грн");
        }

        System.out.println("----------------------------------------------------------------");
        double total = 0;
        double max = totalValues[0];
        int maxIndex = 0;

        for (int i = 0; i < totalValues.length; i++) {
            total = total + totalValues[i];

            if (totalValues[i] > max) {
                max = totalValues[i];
                maxIndex = i;
            }
        }
        System.out.println("Загальна вартість складу: " + total + " грн");
        System.out.println("Найбільший капітал у товарі: " + items[maxIndex] + " (" + max + " грн)");
        System.out.println();
        System.out.println(" ДЕФІЦИТНІ ПОЗИЦІЇ (менше 5 шт.):");

        for (int i = 0; i < items.length; i++) {
            if (quantities[i] < 5) {
                System.out.println("- " + items[i] + " (залишилось: " + quantities[i]
                        + " шт.) ->  Терміново дозамовити!");
            }
        }

        System.out.println("================================================================");
    }
}