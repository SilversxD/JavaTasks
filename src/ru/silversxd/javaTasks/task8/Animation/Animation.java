package ru.silversxd.javaTasks.task8.Animation;

import javax.swing.*;
import java.io.File;

public class Animation {

    public static void main(String[] args) throws InterruptedException {

        String root = "src/ru/silversxd/javaTasks/task8/Animation/Animation_Pics/";

        File folder = new File(root);
        File[] files = folder.listFiles();

        if (files != null)
        {
            JFrame frame = new JFrame();

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            int x = 0;

            while (true) {
                frame.getContentPane().removeAll();
                frame.add(new JLabel(new ImageIcon(root + files[x].getName())));
                frame.pack();
                frame.setVisible(true);
                x++;
                if (x >= files.length) x = 0;
                Thread.sleep(500);
            }
        }
    }
}