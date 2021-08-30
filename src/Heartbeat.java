
public class Heartbeat {
	//David!
	static int count = 0;
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			try {
				System.out.println(count+" seconds have passed");
				count++;
				
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print("Error");
				e.printStackTrace();
			}
		}
	}
}