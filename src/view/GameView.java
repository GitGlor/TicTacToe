package view;

import Main.Renderable;

public interface GameView<T extends Renderable> {

	void render(T renderable);
}

