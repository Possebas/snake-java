import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KBListener extends KeyAdapter {
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 39: // Muda a direcao da Snake para a direita.
			if (GameHandler.dx != -1) {
				GameHandler.dx = 1;
				GameHandler.dy = 0;
			}
			break;
		case 38: // Muda a direcao da Snake para cima.
			if (GameHandler.dy != 1) {
				GameHandler.dx = 0;
				GameHandler.dy = -1;
			}
			break;
		case 37: // Muda a direcao da Snake para a esquerda;
			if (GameHandler.dx != 1) {
				GameHandler.dx = -1;
				GameHandler.dy = 0;
			}
		break;
		case 40: // Muda a direcao da Snake para baixo.
			if (GameHandler.dy != -1) {
				GameHandler.dx = 0;
				GameHandler.dy = 1;
			}
			break;
		case 32:
			FileHandler.saveFile(GameHandler.ent);
			System.out.println("Saved!!"); // Apagar depois
			break;
		case 8:
			//FileHandler.loadFile(GameHandler.ent);
			System.out.println("Loaded!!"); // Apagar depois
			break;
		case 80:
		case 132:
			GameHandler.paused = !GameHandler.paused;
			if(GameHandler.paused) System.out.println("Pause!");
			else System.out.println("Play");
			break;
		default:
			break;
		}
	}
}
