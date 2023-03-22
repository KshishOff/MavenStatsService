package ru.netology.stats;

public class StatsService {
    public long amount(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long medium(long[] sales) {
        return amount(sales) / sales.length;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonthSale = 0;
        int monthTestMax = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonthSale]) {
                maxMonthSale = monthTestMax;
            }
            monthTestMax = monthTestMax + 1;
        }
        return maxMonthSale + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsUnderMedium(long[] sales) {
        long mediumSale = medium(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < mediumSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsUpperMedium(long[] sales) {
        long mediumSale = medium(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > mediumSale) {
                counter++;
            }
        }
        return counter;
    }

}