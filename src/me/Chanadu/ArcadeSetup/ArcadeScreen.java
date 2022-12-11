package me.Chanadu.ArcadeSetup;

import javax.swing.*;
import java.awt.*;

public class ArcadeScreen extends JPanel {
	HolderPanel holderPanel;
	
	ArcadeScreen(HolderPanel holderPanel) {
		this.holderPanel = holderPanel;
		setFocusable(true);
		setPreferredSize(ArcadeFrame.SCREEN_SIZE);
		setBackground(Color.BLUE);
	}
}
