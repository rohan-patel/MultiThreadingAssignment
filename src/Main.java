
public class Main {

	public static void main(String[] args) {
		EvenNumberThread even = new EvenNumberThread();
		Thread t1 = new Thread(even);
		t1.start();

		OddNumberThread odd = new OddNumberThread();
		Thread t2 = new Thread(odd);
		t2.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
