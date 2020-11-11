package ru.silversxd.javaTasks.task19;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String PATH = ".\\src\\ru\\silversxd\\javaTasks\\task19\\text.txt";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File file = new File(PATH);
        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        fw.append(scanner.nextLine());

        fw.close();

        scanner = new Scanner(file);
        System.out.println(scanner.nextLine());

        scanner = new Scanner(System.in);

        try(FileWriter fileWriter = new FileWriter(PATH, true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            PrintWriter pw = new PrintWriter(bw))
        {
            pw.println("\n" + scanner.nextLine());
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
}