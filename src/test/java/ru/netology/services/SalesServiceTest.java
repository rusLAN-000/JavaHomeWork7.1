package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SalesServiceTest {
    SalesService service = new SalesService();
    int[] allSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumAllSales() {

        int expected = 180;
        int actual = service.getSumAllSales(allSale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesOfMonth() {

        int expected = 15;
        int actual = service.getAverageSales(allSale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesOfMonth() {

        int expected = 8;
        int actual = service.getMaxMonth(allSale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesOfMonth() {

        int expected = 9;
        int actual = service.getMinMoth(allSale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void BelowTheAverage() {

        int expected = 5;
        int actual = service.getBelowTheAverage(allSale);

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void aboveAverage() {

        int expected = 5;
        int actual = service.getAboveAverage(allSale);

        Assertions.assertEquals(expected,actual);
    }

}