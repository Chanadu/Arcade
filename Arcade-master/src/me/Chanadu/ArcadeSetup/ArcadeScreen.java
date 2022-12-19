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
        
        Font font = new Font("Arial", Font.BOLD, 30);
        JLabel c = new JLabel("Chess");
        c.setFont(font);
        gamePanels[0][0].add(c);
         gamePanels[0][0].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    JFrame f = new ChessGUI();
                }
            });
        JLabel WIP = new JLabel("WIP");
        WIP.setFont(font);
        gamePanels[0][1].add(WIP);
        WIP = new JLabel("WIP");
        WIP.setFont(font);
        gamePanels[0][2].add(WIP);
        WIP = new JLabel("WIP");
        WIP.setFont(font);
        gamePanels[1][0].add(WIP);
        JLabel snake = new JLabel("Snake");
        snake.setFont(font);
        gamePanels[1][1].add(snake);
        
        gamePanels[1][1].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    JFrame f = new SnakeFrame();
                }
            });
        WIP = new JLabel("WIP");
        WIP.setFont(font);
        gamePanels[1][2].add(WIP);
        
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
                gamePanels[i][j].setLayout(new GridBagLayout());
                gamePanels[i][j].setBackground(Color.BLUE);
                gamePanels[i][j].setFocusable(true);
                gamePanelHolder.add(gamePanels[i][j]);
                
            }
        }
     }
}
