package ch.pokemon.view;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class LauncherView {

	private static JFrame frame = new JFrame("Pokemon Java");		
	private static Button button = new Button("PLAY");

	
	
	public static void showLauncher() {
		frame.setSize(700, 300);
		
		button.setBounds(10, 160, 207, 90);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(button);
		
		JPanel panel_1 = new JPanel(true);
		panel_1.setToolTipText("");
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, -11, 664, 136);
		frame.getContentPane().add(panel_1);
		frame.setVisible(true);
	}
	
	private void setupListeners() {

		// Start-Button Listener
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Game game = new Game();
			}
		});	
	}
}
