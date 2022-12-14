package me.Chanadu.ArcadeSetup;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;

public class ArcadeFrame extends JFrame {
    public static final int GAME_WIDTH = 900;
    public static final int GAME_HEIGHT = (int) (GAME_WIDTH * (3.0 / 4));
    public static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    JPanel holderPanel;
    
    ArcadeFrame() {
        setTitle("Arcade");
        setResizable(false);
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            System.out.println("Cant Load FlatLaf");
        }
        
        holderPanel = new HolderPanel(this);
        add(holderPanel);
        
        pack();
        setLocationRelativeTo(null);
        
        setVisible(true);
    }
    
    public void reRender() {
        validate();
        repaint();
    }
}
