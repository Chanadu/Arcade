package me.Chanadu.ArcadeSetup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class TitleScreen extends JPanel {
    
    Font titleFont;
    Font buttonFont;
    
    HolderPanel holderPanel;
    
    TitleScreen(HolderPanel holderPanel) {
        this.holderPanel = holderPanel;
        try {
            titleFont =
                    Font.createFont(Font.TRUETYPE_FONT, new File("/Users/cpedda26/Desktop/Arcade-master/src/me/Chanadu/Assets/ARCADE_N.TTF")).deriveFont(Font.BOLD, 60);
            buttonFont =
                    Font.createFont(Font.TRUETYPE_FONT, new File("/Users/cpedda26/Desktop/Arcade-master/src/me/Chanadu/Assets/ARCADE_N.TTF")).deriveFont(Font.BOLD, 25);
        } catch (IOException | FontFormatException e) {
            //System.out.println("No font found");
            titleFont = new Font("DialogInput", Font.BOLD, 60);
            buttonFont = new Font("DialogInput", Font.BOLD, 25);
        }
        setFocusable(true);
        setPreferredSize(ArcadeFrame.SCREEN_SIZE);
        initComponents();
    }
    
    private void initComponents() {
        
        JLabel titleLabel = new JLabel();
        JButton playButton = new JButton();
        JButton creditsButton = new JButton();
        JButton settingsButton = new JButton();
        
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(900, 675, 675, 675));
        setPreferredSize(new java.awt.Dimension(900, 675));
        setSize(new java.awt.Dimension(900, 675));
        
        titleLabel.setText("ARCADE");
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setToolTipText("");
        
        playButton.setText("Play");
        playButton.setFont(buttonFont);
        playButton.addActionListener(this::playButtonActionPerformed);
        
        creditsButton.setText("Credits");
        creditsButton.setFont(buttonFont);
        creditsButton.addActionListener(this::creditsButtonActionPerformed);
        
        settingsButton.setText("Settings");
        settingsButton.setFont(buttonFont);
        settingsButton.addActionListener(this::settingsButtonActionPerformed);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                          .addGap(81, 81, 81)
                                          .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(creditsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGap(81, 81, 81))
                        .addGroup(layout.createSequentialGroup()
                                          .addGap(174, 174, 174)
                                          .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                          .addGap(35, 35, 35)
                                          .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                          .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGap(18, 18, 18)
                                          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(creditsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGap(62, 62, 62))
        );
    }
    
    private void settingsButtonActionPerformed(ActionEvent evt) {
        holderPanel.changeScreen("settingsScreen");
    }
    
    private void creditsButtonActionPerformed(ActionEvent evt) {
        holderPanel.changeScreen("creditsScreen");
    }
    
    private void playButtonActionPerformed(ActionEvent evt) {
        holderPanel.changeScreen("arcadeScreen");
    }
}
