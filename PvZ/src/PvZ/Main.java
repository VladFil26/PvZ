/*
 * Oct - Nov 2023
 * Main class
 */
package PvZ;

public class Main {
	static int num = 0;

	public static void main(String[] args) throws InterruptedException {
		UI ui = new UI();
		StartWindow sw = new StartWindow();
		sw.buttonPress(ui);
		ui.timer.start();
		while (ui.restart != true) { // waiting for restart
			Thread.sleep(1000);
		}
		sw = null;// setting null for using constructor again
		ui = null;
		main(args);// Recursion(starting again main)
	}

}
