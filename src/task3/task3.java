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


}
    }