package me.Chanadu.ArcadeSetup;

import javax.swing.*;
import java.awt.*;

public class ArcadeScreen extends JPanel {
	HolderPanel holderPanel;
	
	JPanel[][] gamePanels = new JPanel[3][2];
	
	ArcadeScreen(HolderPanel holderPanel) {
		this.holderPanel = holderPanel;
		setFocusable(true);
		setPreferredSize(ArcadeFrame.SCREEN_SIZE);
		setLayout(new BorderLayout());
		setBackground(Color.BLACK);
	}
}
