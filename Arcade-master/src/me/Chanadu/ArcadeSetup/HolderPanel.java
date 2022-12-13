package me.Chanadu.ArcadeSetup;

import me.Chanadu.snake.*;

import javax.swing.*;
import java.util.HashMap;

public class HolderPanel extends JPanel {
    
    public TitleScreen titleScreen;
    public ArcadeScreen arcadeScreen;
    public CreditsScreen creditsScreen;
    public SettingsScreen settingsScreen;
    public SnakePanel snakeScreen;
    
    public ArcadeFrame frame;
    HashMap<String, JPanel> stringToPanel = new HashMap<>();
    
    public HolderPanel(ArcadeFrame frame) {
        this.frame = frame;
        titleScreen = new TitleScreen(this);
        arcadeScreen = new ArcadeScreen(this);
        settingsScreen = new SettingsScreen(this);
        creditsScreen = new CreditsScreen(this);
        setUpStringToPanel();
        setPreferredSize(ArcadeFrame.SCREEN_SIZE);
        
        changeScreen("titleScreen");
    }
    
    private void setUpStringToPanel() {
        stringToPanel.put("titleScreen", titleScreen);
        stringToPanel.put("arcadeScreen", arcadeScreen);
        stringToPanel.put("creditsScreen", creditsScreen);
        stringToPanel.put("settingsScreen", settingsScreen);
        stringToPanel.put("snakeScreen", snakeScreen);
    }
    
    public void changeScreen(String screenName) {
        removeAll();
        if (screenName == "snakeScreen"){ 
            snakeScreen = new SnakePanel(this);
            add(snakeScreen);
        } else {
            add(stringToPanel.get(screenName));
        }
        frame.reRender();
    }
}
