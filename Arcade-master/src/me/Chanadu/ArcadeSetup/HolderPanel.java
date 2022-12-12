package me.Chanadu.ArcadeSetup;

import javax.swing.*;
import java.util.HashMap;

public class HolderPanel extends JPanel {
	
	public TitleScreen titleScreen;
	public ArcadeScreen arcadeScreen;
	public CreditsScreen creditsScreen;
	public SettingsScreen settingsScreen;
	
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
	}
	
	public void changeScreen(String screenName) {
		removeAll();
		add(stringToPanel.get(screenName));
		frame.reRender();
	}
}
