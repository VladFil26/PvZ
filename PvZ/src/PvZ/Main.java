package PvZ;



public class Main {

	public static void main(String[] args) {
		UI ui=new UI();
		StartWindow sw = new StartWindow();
		sw.buttonPress(ui);
		ui.timer.start();
	}
}
