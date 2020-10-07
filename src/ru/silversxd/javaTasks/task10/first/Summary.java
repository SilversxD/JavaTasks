package ru.silversxd.javaTasks.task10.first;

import java.util.Scanner;

public class Summary {

    public int counter = 0;
    public double k = 0;
    public double s = 0;

    public double getK() {
        return k;
    }

    public double getS() {
        return s;
    }

    public int getCounter() {
        return counter;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void Count(){
        int i = (int) Math.pow(10, this.k-1);
        while (i < Math.pow(10, this.k)) {
            int summ = 0;
            int num = i;

            while(num != 0) {
                summ += num % 10;
                num /= 10;
            }

            if (summ == s) {
                System.out.print(i + " ");
                this.counter++;
            }
            i += 1;
        }
        System.out.println("\nCount of this numbers: " + this.counter);
    }

    public static void main(String[] args) {
        Summary summary = new Summary();
        Scanner console = new Scanner(System.in);
        System.out.print("K: ");
        int k = console.nextInt();
        summary.setK(k);
        System.out.print("S: ");
        int s = console.nextInt();
        summary.setS(s);
        summary.Count();
    }
}