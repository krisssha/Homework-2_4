package task3;

import org.w3c.dom.ls.LSOutput;

public class task3 {
    public static void main(String[] args) {


    int pupilsLudmila = 23;
    int pupilsAnna = 27;
    int pupilsEkaterina = 30;
    int totalSheets = 480;
    int totalPupils = pupilsAnna + pupilsEkaterina + pupilsLudmila;
        System.out.println("Общее количество учеников " + totalPupils);

        int sheetsForEach = totalSheets / totalPupils;
        System.out.println("На каждого ученика рассчитано " + sheetsForEach + " листов бумаги");

        System.out.println();

        int machinePerformance = 16;
        int timePerfomance = 2;
int productivity1Minute = machinePerformance / timePerfomance;
        System.out.println("Производительность за 1 минуту " + productivity1Minute);

        int productivity20Minute = productivity1Minute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + productivity20Minute +" штук ");

        int dayMinute = (24 * 60);
        int productivityDay = productivity1Minute * dayMinute;
        System.out.println("За сутки машина произвела бутылок " + productivityDay +" штук ");

        int threeDay = dayMinute * 3;
        int productivityThreeDay = productivity1Minute * threeDay;
        System.out.println("За 3 дня машина произвела бутылок " + productivityThreeDay +" штук ");

        int mounth = (dayMinute * 30);
        int productivityMounth = productivity1Minute * mounth;
        System.out.println("За месяц машина произвела бутылок " + productivityMounth +" штук ");
        System.out.println();

        int totalCase = 120;
        int whiteCase1class = 2;
        int brounCase1class = 4;
        int case1class = (whiteCase1class + brounCase1class);
        int totalClass = (totalCase / case1class);
        int totalBrounCase = (brounCase1class * totalClass);
        int totalWhiteCase = (whiteCase1class * totalClass);

        System.out.println( "В школе, где " +  totalClass + " классов, нужно " + totalWhiteCase + " банок белой краски и "
                + totalBrounCase + " банок коричневой краски");
        System.out.println();

        int weightOneBanan = 80;
        int weight100mlMilk = 105;
        int weightOneBriket = 100;
        int weihgOneEgg = 70;

        int weightKoktel = (weightOneBanan * 5) + (weight100mlMilk * 2) + (weightOneBriket * 2 ) + (weihgOneEgg * 4);
        float kg = 1000f;
        float weightKg = weightKoktel / kg;
        System.out.println("Вес коктейля в киллограммах " + weightKg);
        System.out.println();

        int needWeight = 7;
        int needWeightG = needWeight * 1000;
        int minWeightLoss = 250;
        int maxWeightLoss = 500;
        int totalDay250 = needWeightG / minWeightLoss;
        System.out.println("При похудении на 250 г в день не обходимо " + totalDay250 + "дней");

        int totalDay500 = needWeightG / maxWeightLoss;
        System.out.println("При похудении на 500 г в день не обходимо " + totalDay500 + "дней");

        int average = (minWeightLoss + maxWeightLoss) / 2;

        int totalDayAverage = needWeightG / average;
        System.out.println("При похудении на " + average + " г в день не обходимо " + totalDayAverage + "дней");
        System.out.println();



        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;

       double salaryBonusMasha = (Masha * 0.1) + Masha;
      double salaryBonusDenis = (Denis * 0.1) + Denis;
      double salaryBonusKristina = (Kristina * 0.1) + Kristina;

      int yearsSalaryMasha = Masha * 12 ;
      int yearsSalaryDenis = Denis * 12;
      int yearsSalaryKristina = Kristina * 12;

      double yearsSalaryBonusMasha = yearsSalaryMasha * 12;
        double yearsSalaryBonusDenis = yearsSalaryDenis * 12;
        double yearsSalaryBonusKristina = yearsSalaryKristina * 12;

        double salaryDifferenceMasha = yearsSalaryBonusMasha - yearsSalaryMasha;
        double salaryDifferenceDenis = yearsSalaryBonusDenis - yearsSalaryDenis;
        double salaryDifferenceKristina = yearsSalaryBonusKristina - yearsSalaryKristina;

        System.out.println( "Маша теперь получает " +yearsSalaryMasha + "рублей. Годовой доход вырос на " + salaryDifferenceMasha +" рублей");
        System.out.println( "Денис теперь получает " +yearsSalaryDenis + "рублей. Годовой доход вырос на " + salaryDifferenceDenis +" рублей");
        System.out.println( "Кристина теперь получает " +yearsSalaryKristina + "рублей. Годовой доход вырос на " + salaryDifferenceKristina +" рублей");

}
    }