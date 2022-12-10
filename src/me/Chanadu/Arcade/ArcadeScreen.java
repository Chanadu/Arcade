package me.Chanadu.Arcade;

import javax.swing.*;
import java.awt.*;

public class ArcadeScreen extends JPanel {
	
	ArcadeScreen(JFrame frame) {
		setFocusable(true);
		setPreferredSize(ArcadeFrame.SCREEN_SIZE);
		setBackground(Color.BLUE);
	}
}
