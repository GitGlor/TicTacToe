package Main;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import rules.XODiagonalGameRules;
import rules.XOGameRules;
import view.ConsoleGameView;
import view.RedConsoleGameView;
import view.UIGameView;

public class Test {
	public static void main(String[] args) {
		Field[][] fields;
		
		ConsoleGameView consoleGameView = new ConsoleGameView();
		RedConsoleGameView redConsoleGameView = new RedConsoleGameView();
//		UIGameView uiGameView = new UIGameView();
		
		XOGameRules gameRules = new XOGameRules();
		
		XODiagonalGameRules diagonalGameRules = new XODiagonalGameRules();
		
		Game game = new Game(consoleGameView, gameRules);
		
		game.startGame();
		
//		//x
//		game.chooseField(0, 0);
//		//y
//		game.chooseField(1, 1);
//		//x
//		game.chooseField(0, 1);
//		//y
//		game.chooseField(2, 1);
//		//x
//		game.chooseField(0, 2);
//		//y
//		game.chooseField(1, 2);
//		//x
//		game.chooseField(2, 0);
//		//y
//		game.chooseField(0, 2);
//		//x
//		game.chooseField(2, 1);
		
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    
	
	while (true) {
		System.out.println("Type in position in format x-y");
		
		
		String name = "error";
		try {
			name = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	    System.out.println(name);
	    
	    try {
	    	String[] positions = name.split("-");
		    String positionX = positions[0];
		    String positionY = positions[1];
		    
		    int x = Integer.parseInt(positionX);
		    int y = Integer.parseInt(positionY);
		     
		    game.chooseField(x, y);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid format, must be in x-y format");
		}
	    
		if () {
	    	break;
	    }
		
	}
	

	}

}
