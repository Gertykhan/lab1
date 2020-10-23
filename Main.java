package com.company;
import java.util.Scanner;

public class Main
{
    public static double integral(double a, double b, Function function)
    {
        double sum = 0;
        double lengthX = 0.01;
        for (int i = 0; i < (b - a) / lengthX; i++)
        {
            sum += lengthX * (0.5 * (function.func(a + i * lengthX) + function.func(a + (i + 1) * lengthX)));
        }
        return sum;
    }


    public static void main(String[] args)
    {
        Scanner var = new Scanner(System.in);
        String code = "1";
        boolean Eq = true;
        while (Eq)
        {
            System.out.println("Введите пределы интегрирования: ");
            int start = var.nextInt();
            int end = var.nextInt();
            System.out.printf("Интеграл равен: " + integral(start, end, x -> (Math.pow(x, 2)) + (Math.sin(2 * x)) + x - 3));
            System.out.println(" ");
            System.out.println("Для Выхода из программы введите exit: ");
            code = var.next();
            Eq = code.equals("exit");
            Eq = !Eq;
        }
    }

}
interface Function
{
    public  double func (double x);
}