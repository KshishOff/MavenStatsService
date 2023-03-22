package ru.netology;

import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long amount = service.amount(sales);
        long medium = service.medium(sales);
        int maxMonth = service.maxSalesMonth(sales);
        int minMonth = service.minSalesMonth(sales);
        int monthUnderMedium = service.monthsUnderMedium(sales);
        int monthUpperMedium = service.monthsUpperMedium(sales);




        System.out.println("Сумма всех продаж: " + amount);
        System.out.println("Средняя сумма продаж: " + medium);
        System.out.println("Максимальная сумма продаж в " +  maxMonth + " месяце");
        System.out.println("Минимальная сумма продаж в " +  minMonth + " месяце");
        System.out.println(monthUnderMedium  + " месяцев продажи ниже среднего");
        System.out.println(monthUpperMedium  + " месяцев продажи выше среднего");
    }
}