package view;

import Main.Game;

public class ConsoleGameView implements GameView<Game> {

	@Override
	public void render(Game renderable) {		
		System.out.println(renderable.getBoard());
		System.out.println(renderable.getGameState());
	}	
}
