package me.Chanadu.Slider;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SliderMain extends JFrame
{
    public SliderMain() {
        this.setTitle("Slider");
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        add(new SliderPanel(),  BorderLayout.CENTER);
        this.setVisible(true);
    }
}
