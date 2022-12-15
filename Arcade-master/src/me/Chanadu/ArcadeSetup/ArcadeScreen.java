package me.Chanadu.ArcadeSetup;

import me.Chanadu.snake.*;
import me.Chanadu.Chess.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArcadeScreen extends JPanel{
    HolderPanel holderPanel;
    JPanel gamePanelHolder = new JPanel();
    JPanel[][] gamePanels = new JPanel[2][3];
    GridLayout layout = new GridLayout(2, 3);
    
        ArcadeScreen(HolderPanel holderPanel){
        this.holderPanel = holderPanel;
        setFocusable(true);
        setPreferredSize(ArcadeFrame.SCREEN_SIZE);
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        setUpPanels();
        
        
        gamePanels[0][0].add(new JLabel("Chess"));
         gamePanels[0][0].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    JFrame f = new ChessGUI();
                }
            });
        gamePanels[0][1].add(new JLabel("Minesweeper"));
        gamePanels[0][2].add(new JLabel("Pong"));
        gamePanels[1][0].add(new JLabel("Slider Puzzle"));
        gamePanels[1][1].add(new JLabel("Snake"));
        
        gamePanels[1][1].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    JFrame f = new SnakeFrame();
                }
            });
        gamePanels[1][2].add(new JLabel("Scramble"));
        
        add(gamePanelHolder);
    }
    
    private void setUpPanels() {
        gamePanelHolder.setLayout(layout);
        layout.setHgap(10);
        layout.setVgap(10);
        gamePanelHolder.setPreferredSize(ArcadeFrame.SCREEN_SIZE);
        gamePanelHolder.setBackground(Color.GRAY);
        for (int i = 0; i < gamePanels.length; i++) {
            for (int j = 0; j < gamePanels[0].length; j++) {
                gamePanels[i][j] = new JPanel();
                gamePanels[i][j].setBackground(Color.BLUE);
                gamePanels[i][j].setFocusable(true);
                gamePanelHolder.add(gamePanels[i][j]);
                
            }
        }
     }
}
