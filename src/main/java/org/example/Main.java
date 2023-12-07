package org.example;
import java.util.Scanner;
public class Main {
    public interface DopustimPrimer1 {void primer1();}
    public interface DopustimPrimer2 {String primer2(String c);}
//Double - Умножение;
public interface DopustimPrimer3
{double primer3(double a, double b);}
    public static void main(String[] args)
    {DopustimPrimer2 primer2;
        // Интерфейс с двумя значениями под две переменных;
        DopustimPrimer3 primer3;
        primer3 = (a,b)->a*b;
        double res = primer3.primer3(5.4, 9.7);
        System.out.println("Третий пример: " + res);}
}