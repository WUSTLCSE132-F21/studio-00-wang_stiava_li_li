
public class Heartbeat {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 1000; i++) {
			System.out.print(i);
			System.out.print("Hello World");
			System.out.println();
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
