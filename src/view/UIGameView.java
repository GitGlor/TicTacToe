package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Main.Renderable;
import javax.swing.JTextArea;

public class UIGameView extends JFrame implements GameView {
	
	JTextArea textArea;
	
	public UIGameView() {

	      setSize(400,400);
	      setVisible(true);
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
	      
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("btn clicked");
			}
		});
		btnNewGame.setSize(200, 100);
		panel.add(btnNewGame);
		
		textArea = new JTextArea();
		textArea.setColumns(4);
		textArea.setRows(5);
		textArea.setSize(200, 200);
		panel.add(textArea);
		
		panel.setSize(400, 400);
	}

	@Override
	public void render(Renderable renderable) {
		textArea.setText(renderable.getGameState().name());
	}
	

}
