package me.Chanadu.Slider;


import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SliderPanel extends JPanel implements KeyListener
{
    private GridLayout layout= new GridLayout(4, 4);
    public JPanel[][] panels = new JPanel[4][4];
    public int[] openPanel = {2, 2};
    public JPanel emptyPanel = new JPanel();
    
    SliderPanel() {
        setBackground(Color.BLUE);
        layout.setHgap(10);
        layout.setVgap(10);
        setLayout(layout);
        setUpPanels();
    }
    
    void setUpPanels() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                panels[i][j] = new JPanel();
                panels[i][j].add(new JLabel("" + (i * 4 + j + 1)));
                panels[i][j].setBackground(Color.RED);
                add(panels[i][j]);
            }
        }
        
        remove(panels[3][3]);
        add(emptyPanel);
        emptyPanel.setBackground(Color.YELLOW);
    }
    
    void reDrawPanels() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                remove(panels[i][j]);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                add(panels[i][j]);
            }
        }
    }
    
    @Override public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            if (openPanel[1] == 0) {
                return;
            }
            System.out.println("Not returned");
            panels[openPanel[0]][openPanel[1]] = panels[openPanel[0]][openPanel[1] - 1];
            panels[openPanel[0]][openPanel[1] - 1] = emptyPanel;
            reDrawPanels();
       }
        
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (openPanel[0] == 3) {
                return;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (openPanel[1] == 0) {
                return;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (openPanel[0] == 0) {
                return;
            }
            
        }
    }
    @Override public void keyReleased(KeyEvent e) {
        // No code - as its not used
    }
    @Override public void keyTyped(KeyEvent e) {
        // No code - as its not used
    }
}
