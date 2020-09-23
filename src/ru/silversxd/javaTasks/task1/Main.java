package ru.silversxd.javaTasks.task1;

import java.util.Arrays;

public class Main {

    public static void task3() {
        int[] mass = {1, 4, 6, 2, 7};
        int summ = 0;
        for (int i = 0; i < 5; i++) {
            summ += mass[i];
        }
        System.out.println(summ);
    }

    public static void task3_1() {
        int[] mass = {1, 4, 6, 2, 7};
        int summ = 0;
        int i = mass.length - 1;
        while (i >= 0) {
            summ += mass[i];
            i -= 1;
        }
        System.out.println(summ);
    }

    public static void task3_2() {
        int[] mass = {1, 4, 6, 2, 7};
        int summ = 0;
        int i = mass.length - 1;
        do {
            summ += mass[i];
            i -= 1;
        }
        while (i >= 0);
        System.out.println(summ);
    }

    public static void task4(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }

    public static void task5() {
        double[] mass;
        mass = new double[10];
        double n = 1;
        for (int i = 0; i < 10; i++) {
            mass[i] = 1 / n;
            n += 1;
            System.out.printf("%.2f\n", mass[i]);
        }
    }

    public static void task6() {
        int[] mass = new int[10];
        for (int i = 0; i < 10; i++)
            mass[i] = (int) (Math.random() * 10);
        for (int i = 0; i < 10; i++)
            System.out.println(mass[i]);
        Arrays.sort(mass);
        for (int i = 0; i < 10; i++)
            System.out.println(mass[i]);
        /*Random ran = new Random(100);
        for(int i = 0; i < 10; i++)
            mass[i] = ran.nextInt(100);
        Arrays.sort(mass);
        for(int i = 0; i < 10; i++)
            System.out.println(mass[i]);*/
    }

    public static void task7(int facl) {
        int num = 1;
        for (int i = 1; i <= facl; i++)
            num *= i;
        System.out.println(num);
        if (facl == 0) {
            System.out.println(1);
        }
    }

    public static void main(String[] args) {
        task3();
        task3_1();
        task3_2();
        task4(args);
        task5();
        task6();
        task7(2);
    }
}
