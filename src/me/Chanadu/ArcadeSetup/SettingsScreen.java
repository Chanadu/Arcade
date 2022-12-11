package me.Chanadu.ArcadeSetup;

import javax.swing.*;
import java.awt.*;

public class SettingsScreen extends JPanel {
	
	
	SettingsScreen(HolderPanel holderPanel) {
		initComponents();
	}
	
	
	private void initComponents() {
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
		
		DifficultyLabel.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		DifficultyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DifficultyLabel.setText("Difficulty:");
		DifficultyLabel.setMaximumSize(new Dimension(299, 38));
		
		masterVolumeLabel.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		masterVolumeLabel.setText("Master VolumE:100");
		
		difficultyComboBox.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		difficultyComboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Easy", "Medium", "Hard"}));
		difficultyComboBox.addActionListener(this::difficultyComboBoxActionPerformed);
		
		specialCodesTextField.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		specialCodesTextField.addActionListener(this::specialCodesTextFieldActionPerformed);
		
		specialCodesLabel.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		specialCodesLabel.setText("Special Codes:");
		
		exitButton.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		exitButton.setText("Exit");
		exitButton.addActionListener(this::exitButtonActionPerformed);
		
		movementToggle.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		movementToggle.setText("Player 1: Arrow Keys");
		movementToggle.setContentAreaFilled(false);
		movementToggle.setFocusCycleRoot(true);
		movementToggle.addActionListener(this::movementToggleActionPerformed);
		
		jCheckBox.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		jCheckBox.setText("Timer");
		jCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		jCheckBox.addActionListener(this::jCheckBox1ActionPerformed);
		
		jLabel1.setFont(new Font("Arcade Normal", Font.BOLD, 30)); // NOI18N
		jLabel1.setText("Game Speed:5");
		
		jSlider1.setMajorTickSpacing(1);
		jSlider1.setMaximum(5);
		jSlider1.setMinimum(1);
		jSlider1.setMinorTickSpacing(1);
		
		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										                    .addGroup(layout.createSequentialGroup()
												                              .addGap(335, 335, 335)
												                              .addComponent(jCheckBox))
										                    .addGroup(layout.createSequentialGroup()
												                              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												                              .addComponent(movementToggle)))
								          .addGap(0, 0, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										                    .addGroup(layout.createSequentialGroup()
												                              .addContainerGap()
												                              .addComponent(specialCodesLabel, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
												                              .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												                              .addComponent(specialCodesTextField))
										                    .addGroup(layout.createSequentialGroup()
												                              .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
														                                        .addGroup(layout.createSequentialGroup()
																                                                  .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																                                                  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																		                                                            .addGroup(layout.createSequentialGroup()
																				                                                                      .addComponent(DifficultyLabel, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
																				                                                                      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																				                                                                      .addComponent(difficultyComboBox, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
																		                                                            .addComponent(jSlider1, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)))
														                                        .addGroup(layout.createSequentialGroup()
																                                                  .addGap(270, 270, 270)
																                                                  .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE))
														                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
																                                                  .addComponent(masterVolumeSlider, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE)
																                                                  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
																		                                                            .addGroup(layout.createSequentialGroup()
																				                                                                      .addGap(237, 237, 237)
																				                                                                      .addComponent(jLabel1))
																		                                                            .addGroup(layout.createSequentialGroup()
																				                                                                      .addContainerGap(203, Short.MAX_VALUE)
																				                                                                      .addComponent(masterVolumeLabel)))))
												                              .addGap(173, 173, 173))
										                    .addGroup(layout.createSequentialGroup()
												                              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												                              .addComponent(settingsLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								          .addContainerGap())
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								                                          .addContainerGap()
								                                          .addComponent(settingsLabel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
								                                          .addGap(24, 24, 24)
								                                          .addComponent(masterVolumeLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								                                          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								                                          .addComponent(masterVolumeSlider, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								                                          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
								                                          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										                                                    .addComponent(difficultyComboBox, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
										                                                    .addComponent(DifficultyLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
								                                          .addGap(20, 20, 20)
								                                          .addComponent(jLabel1)
								                                          .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								                                          .addComponent(jSlider1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								                                          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
								                                          .addComponent(movementToggle)
								                                          .addGap(18, 18, 18)
								                                          .addComponent(jCheckBox)
								                                          .addGap(18, 18, 18)
								                                          .addComponent(exitButton)
								                                          .addGap(26, 26, 26)
								                                          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										                                                    .addComponent(specialCodesTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										                                                    .addComponent(specialCodesLabel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
								                                          .addGap(17, 17, 17))
		);
	}
	
	private void difficultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
	
	}
	
	private void specialCodesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
	
	}
	
	private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
	
	}
	
	private void movementToggleActionPerformed(java.awt.event.ActionEvent evt) {
	
	}
	
	private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
	
	}
}
