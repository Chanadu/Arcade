package me.Chanadu.ArcadeSetup;

import javax.swing.*;
import java.awt.*;

public class SettingsScreen extends JPanel {
	
	HolderPanel holderPanel;
	
	SettingsScreen(HolderPanel holderPanel) {
		this.holderPanel = holderPanel;
		initComponents();
	}
	
	
	private void initComponents() {
		setBackground(Color.BLACK);
		Font arcadeFont = new Font("Arcade Normal", Font.BOLD, 30);
		JLabel settingsLabel = new JLabel();
		JLabel DifficultyLabel = new JLabel();
		JSlider masterVolumeSlider = new JSlider();
		JLabel masterVolumeLabel = new JLabel();
		JComboBox<String> difficultyComboBox = new JComboBox<>();
		JTextField specialCodesTextField = new JTextField();
		JLabel specialCodesLabel = new JLabel();
		JButton exitButton = new JButton();
		JToggleButton movementToggle = new JToggleButton();
		JCheckBox jCheckBox = new JCheckBox();
		JLabel jLabel1 = new JLabel();
		JSlider jSlider1 = new JSlider();
		
		setMaximumSize(new Dimension(900, 675));
		setMinimumSize(new Dimension(900, 675));
		setName(""); // NOI18N
		setPreferredSize(new Dimension(900, 675));
		setRequestFocusEnabled(false);
		
		settingsLabel.setFont(new Font("Arcade Normal", Font.BOLD, 60)); // NOI18N
		settingsLabel.setText("Settings");
		
		DifficultyLabel.setFont(arcadeFont); // NOI18N
		DifficultyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DifficultyLabel.setText("Difficulty:");
		DifficultyLabel.setMaximumSize(new Dimension(299, 38));
		
		masterVolumeLabel.setFont(arcadeFont); // NOI18N
		masterVolumeLabel.setText("Master Volume:100");
		
		difficultyComboBox.setFont(arcadeFont); // NOI18N
		difficultyComboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Easy", "Medium", "Hard"}));
		difficultyComboBox.addActionListener(this::difficultyComboBoxActionPerformed);
		
		specialCodesTextField.setFont(arcadeFont); // NOI18N
		specialCodesTextField.addActionListener(this::specialCodesTextFieldActionPerformed);
		
		specialCodesLabel.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		specialCodesLabel.setText("Special Codes:");
		
		exitButton.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		exitButton.setText("Exit");
		exitButton.addActionListener(this::exitButtonActionPerformed);
		
		movementToggle.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		movementToggle.setText("Player 1: Arrow Keys");
		movementToggle.setContentAreaFilled(false);
		movementToggle.addActionListener(this::movementToggleActionPerformed);
		
		jCheckBox.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		jCheckBox.setText("Timer");
		jCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		jCheckBox.addActionListener(this::jCheckBoxActionPerformed);
		
		jLabel1.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		jLabel1.setText("Game Speed:5");
		
		jSlider1.setMajorTickSpacing(1);
		jSlider1.setMaximum(5);
		jSlider1.setMinimum(1);
		jSlider1.setMinorTickSpacing(1);
		
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layout);
		setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(settingsLabel);
		this.add(masterVolumeLabel);
		this.add(masterVolumeSlider);
		this.add(jLabel1);
		this.add(jSlider1);
		this.add(difficultyComboBox);
		this.add(movementToggle);
		this.add(specialCodesLabel);
		this.add(specialCodesTextField);
		this.add(exitButton);
	}
	
	private void difficultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
	
	}
	
	private void specialCodesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
	
	}
	
	private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
		holderPanel.changeScreen("titleScreen");
	}
	
	private void movementToggleActionPerformed(java.awt.event.ActionEvent evt) {
	
	}
	
	private void jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
	
	}
}
