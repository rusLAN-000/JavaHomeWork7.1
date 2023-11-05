package ru.netology.services;

public class SalesService {
    public int getSumAllSales(int[] sales) {
        int allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[i];
        }
        return allSales;
    }

    public int getAverageSales(int[] sales) {
        int averageSales = getSumAllSales(sales) / 12;
        return averageSales;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMoth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
    public int getBelowTheAverage(int[] sales) {
        int belowTheAverageSales = 0;
        for(int a : sales){
            if (a < getAverageSales(sales)){
                belowTheAverageSales++;
            }
        }
        return belowTheAverageSales;
    }
    public int getAboveAverage(int[] sales) {
        int aboveAverage = 0;
        for(int a : sales){
            if (a > getAverageSales(sales)){
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}
