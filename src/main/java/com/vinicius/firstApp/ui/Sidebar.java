package com.vinicius.firstApp.ui;

import com.vinicius.firstApp.components.Button;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Sidebar extends JPanel {
    public Sidebar() {
        this.setLayout(
            new GridLayout(3,1)
        );
        this.setBorder(
                new EmptyBorder(30,30,30,30)
        );
        this.setVisible(true);
        this.setBackground(new Color(33,33,48));

        this.add(
          new Button("Página Inicial")
        );

        this.add(
            new Button("Produtos")
        );

        this.add(
            new Button("Relatórios")
        );
    }
}
