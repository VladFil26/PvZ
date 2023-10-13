
//Zombie(s) moves left one tile on a JButton every second
//have it check if theres a plant on the left of it if so eat it, yummy!!
package PvZ;

import java.util.Random;
import java.util.Timer;
import javax.swing.*;

public class Zombie {

	int random;

	Random r = new Random();

	// Puts a zombie on a random tile on the far right, if a zombie is already
	// there, it tries again
	// Adds a placeholder to every zombie, it'll save a headache later on

	public int[][] zombieSpawn(int zombies[][], int random) {
		for (int i = 0; i < 1;) {
			random = r.nextInt(8);
			if (zombies[random][9] == 0) {
				zombies[random][9] = 200;
				i = 1;
			}
		}
		return zombies;
	}

	// Moves the zombie by scanning every tile for a number higher than 0, because
	// if there's health
	// That means there's a zombie on that tile

	// Please someone fucking kill me
	// This project is going to be the god damn end of me :)

	public int[][] zombieMove(int zombies[][], UI ui) {
		for (int end = 0; end < ui.board.length;) {
			for (int i = 0; i < 5;) {
				int ii = 0;
				for (ii = 0; i < ui.board[0].length;) {
					if (zombies[i][ii] > 0) {
						zombies[i][ii - 1] = zombies[i][ii];
						ui.board[i][ii - 1].setIcon(ui.imageZombie);
						ui.board[i][ii].setIcon(ui.imageTile);
						zombies[i][ii] = 0;
					}
					end = end + 1;
					ii = ii + 1;
				}
				i = i + 1;
				ii = 0;
			}
		}
		return zombies;
	}
}
