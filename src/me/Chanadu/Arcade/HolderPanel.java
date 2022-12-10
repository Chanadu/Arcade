package me.Chanadu.Arcade;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class HolderPanel extends JPanel {
	public TitleScreen titleScreen;
	public ArcadeScreen arcadeScreen;
	
	HashMap<String, JPanel> stringToPanel;
	
	public HolderPanel(JFrame frame) {
		titleScreen = new TitleScreen(frame);
		arcadeScreen = new ArcadeScreen(frame);
		
		stringToPanel = (HashMap<String, JPanel>) Map.ofEntries(
				entry("titleScreen", titleScreen),
				entry("arcadeScreen", arcadeScreen)
		);
		
		setPreferredSize(ArcadeFrame.SCREEN_SIZE);
		add(titleScreen);
	}
	
	public void changeScreen(String screenName) {
		removeAll();
		add(stringToPanel.get(screenName));
	}
}
