package com.vinicius.firstApp.FirstScreen;

import com.vinicius.firstApp.ui.Sidebar;

import javax.swing.*;
import java.awt.*;

public class Init {
    public static void main(String[] args) {
        JFrame j = new JFrame("Meu primeiro Frame Em Java");
        j.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Sidebar sidebar = new Sidebar();

        j.setSize(1200,1300);

        j.getContentPane().setBackground(new Color(23,22,34));

        Container contentPane = j.getContentPane();
        contentPane.setLayout(
            new FlowLayout(FlowLayout.LEFT, 0,90)
        );

        j.add(sidebar);

        j.setVisible(true);
    }
}
