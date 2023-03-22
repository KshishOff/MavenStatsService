package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test

    public void testAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.amount(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testMedium() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.medium(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testUnderMediumMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.monthsUnderMedium(sales);

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testUpperMediumMonths() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.monthsUpperMedium(sales);

        Assertions.assertEquals(expected, actual);
    }


}