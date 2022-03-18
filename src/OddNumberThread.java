
public class OddNumberThread extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}
	}
}
