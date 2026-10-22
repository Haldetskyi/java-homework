//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task1CurrencyExchange {
    public static void main(String[] args) {
        double usdAmount = 250.0;
        final double EXCHANGE_RATE = 41.25;
        final double COMMISSION_PERCENT = 1.5;
        double totalGrn = usdAmount * EXCHANGE_RATE;
        double commisionGrn = totalGrn * COMMISSION_PERCENT / 100;
        double giveGrn = totalGrn - commisionGrn;
        long cashGrn = Math.round(giveGrn);
        System.out.println("============= КВИТАНЦІЯ ОБМІНУ =============");
        System.out.println("Сума до обміну:             " + usdAmount + " USD");
        System.out.println("Курс валют:                 " + EXCHANGE_RATE + " UAH/USD");
        System.out.println("Нараховано до комісії:      " + totalGrn + " UAH");
        System.out.println("Комісія банку (" + COMMISSION_PERCENT + "%):       " + commisionGrn + " UAH");
        System.out.println("---------------------------------------------");
        System.out.println("Чиста сума до видачі:       " + giveGrn + " UAH");
        System.out.println("До видачі готівкою:         " + cashGrn + " UAH");
        System.out.println("=============================================");
    }
}