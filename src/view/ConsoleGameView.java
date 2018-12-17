package view;

import Main.Renderable;

public class ConsoleGameView implements GameView {

	@Override
	public void render(Renderable renderable) {
		System.out.println(renderable.getGameState());
	}
}
