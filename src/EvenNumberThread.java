
public class EvenNumberThread extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
		}
	}
}
