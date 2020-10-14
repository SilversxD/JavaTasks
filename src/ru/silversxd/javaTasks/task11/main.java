package ru.silversxd.javaTasks.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class main extends JFrame {

    private static final Random random = new Random();
    public static final int width = 800;
    public static final int height = 600;
    private static final int secret = random.nextInt(19) + 1;
    private static int count = 0;
    public main(){
        super("Task 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JButton btn = new JButton("Click");
        btn.setBounds(10, 10, 100, 50);
        final JTextField minField = new JTextField("", 25);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNum = Integer.parseInt(minField.getText());
                if (userNum == secret){
                    JOptionPane.showMessageDialog(main.this, "Вы угадали число!!!");
                    System.exit(0);
                } else if (userNum > secret){
                    JOptionPane.showMessageDialog(main.this,"Загаданное число меньше");
                } else {
                    JOptionPane.showMessageDialog(main.this, "Загаданное число больше");
                }
                count++;
                if (count >= 3){
                    JOptionPane.showMessageDialog(main.this, "У вас закончились попытки");
                    System.exit(0);
                }
            }
        });
        JPanel pane = new JPanel(new FlowLayout(FlowLayout.CENTER));

        pane.add(minField);
        pane.add(btn);
        setContentPane(pane);
        setSize(width, height);
        setVisible(true);
        System.out.println(secret);
    }

    public static void main(String[] args) {
        new main();
    }
}