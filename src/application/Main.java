package application;

import javax.swing.JFrame;

import entities.GamePanel;

public class Main {

	public Main() {

		JFrame frame = new JFrame();
		GamePanel gamepanel = new GamePanel();

		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SNAKECODING");

		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		new Main();

	}

}
