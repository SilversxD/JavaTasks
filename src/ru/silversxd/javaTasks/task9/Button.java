package ru.silversxd.javaTasks.task9;
import ru.silversxd.javaTasks.task8.Shapes.*;

import javax.swing.*;
import java.awt.*;

public class Button extends JFrame {

    private final int windowWidth = 800;
    private final int windowHeight = 600;

    public Button()
    {
        super("Generate Shape by Button");

        JButton b = new JButton("Add Random Shape");
        RandomShapesTest shape = new RandomShapesTest();

        setLayout(new FlowLayout());
        setSize(windowWidth, windowHeight);
        add(b);
        b.addActionListener(e -> shape.paint(getGraphics()));
        setVisible(true);
    }

    public static void main(String[] args) {
        new Button();
    }

}