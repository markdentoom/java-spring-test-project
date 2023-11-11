package com.metadatagroup.metadataartifact;

import com.metadatagroup.metadataartifact.game.GameRunner;
import com.metadatagroup.metadataartifact.game.MarioGame;
import com.metadatagroup.metadataartifact.game.SuperContraGame;
import com.metadatagroup.metadataartifact.game.PacManGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
