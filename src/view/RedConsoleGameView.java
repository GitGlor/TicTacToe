package view;

import Main.Renderable;

public class RedConsoleGameView implements GameView {

	@Override
	public void render(Renderable renderable) {
		System.err.println(renderable.getGameState());
		
	}

}
